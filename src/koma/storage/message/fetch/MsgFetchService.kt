package koma.storage.message.fetch

import domain.Chunked
import javafx.concurrent.ScheduledService
import javafx.concurrent.Task
import javafx.util.Duration
import koma.matrix.pagination.FetchDirection
import koma_app.appState
import matrix.room.RoomEvent

class LoadRoomMessagesService(
        val roomId: String,
        var since: String,
        val direction: FetchDirection,
        val limit_key: String?
) : ScheduledService<Chunked<RoomEvent>?>() {

    private var last_batch_fetched = false

    init {
        this.restartOnFailure = true
        this.period = Duration.seconds(0.9)
    }

    override fun createTask(): Task<Chunked<RoomEvent>?> {
        val task = LoadRoomMessagesTask()
        task.setOnSucceeded {
            if (last_batch_fetched) {
                this.cancel()
            }
        }
        return task
    }

    private inner class LoadRoomMessagesTask(): Task<Chunked<RoomEvent>?>() {
        override fun call(): Chunked<RoomEvent>? {
            val service = appState.apiClient
            service?:let {
                println("no service for loading messages")
                failed()
                return null
            }

            val call_res = service.getRoomMessages(roomId, since, direction, limit_key)
            if (call_res == null) {
                println("failed to get messages")
                failed()
                return null
            }
            val next = call_res.end
            if (next == null || next == since) {
                println("finished loading room messages")
                last_batch_fetched = true
            } else {
                since = next
            }
            succeeded()
            return call_res
        }
    }

}

