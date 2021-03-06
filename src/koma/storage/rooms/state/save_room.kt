package koma.storage.rooms.state

import koma.Koma
import koma.matrix.event.room_message.state.RoomPowerLevelsContent
import koma.matrix.room.naming.RoomAlias
import koma.matrix.room.participation.RoomJoinRules
import koma.matrix.room.visibility.HistoryVisibility
import koma.matrix.room.visibility.RoomVisibility

val statefilename = "room_state.json"
val usersfilename = "users.txt"

fun Koma.state_save_path(vararg paths: String): String? {
    return this.paths.getOrCreate("state", *paths)
}

class SavedRoomState (
    val aliases: List<RoomAlias>,
    val visibility: RoomVisibility,
    val join_rule: RoomJoinRules,
    val history_visibility: HistoryVisibility,
    val name: String?,
    val icon_Url: String,
    val power_levels: RoomPowerLevelsContent?
)
