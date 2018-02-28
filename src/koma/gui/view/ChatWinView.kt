package view

import javafx.geometry.Pos
import javafx.scene.layout.Priority
import koma.controller.requests.membership.leaveRoom
import koma.gui.element.icon.AvatarAlways
import koma.gui.view.chatview.SwitchableRoomView
import koma.gui.view.listview.RoomListView
import koma.gui.view.window.chatroom.roominfo.RoomInfoDialog
import koma.storage.config.profile.Profile
import koma.storage.config.settings.AppSettings
import model.Room
import model.RoomItemModel
import tornadofx.*


/**
 * Created by developer on 2017/6/21.
 */

class ChatView(profile: Profile): View() {

    override val root = vbox (spacing = 5.0)

    val roomListView: RoomListView
    val switchableRoomView: SwitchableRoomView by inject()

    init {
        val roomList = profile.getRoomList()
        roomListView = RoomListView(roomList)

        with(root) {
            hbox() {
                vgrow = Priority.ALWAYS

                add(roomListView)

                add(switchableRoomView)
            }

        }


    }

}

class RoomFragment: ListCellFragment<Room>() {

    val room = RoomItemModel(itemProperty)
    val iconUrl = room.select { it.iconURLProperty }

    override val root = hbox(spacing = 10.0) {
        val scale = AppSettings.settings.scaling
        minWidth = 1.0
        prefWidth = 1.0
        alignment = Pos.CENTER_LEFT
        contextmenu {
            item("Room Info").action { openInfoView() }
            separator()
            item("Leave").action {
                leaveRoom(itemProperty.value)
            }

        }
        val iconsize = scale * 32.0
        hyperlink {
            graphic = AvatarAlways(iconUrl, room.name, room.color)
            minHeight = iconsize
            minWidth = iconsize
            action { openInfoView() }
        }

        label(room.name) {
            textFillProperty().bind(room.color)
        }
    }

    private fun openInfoView() {
        val room = itemProperty.value
        if (room != null) {
            RoomInfoDialog(room).openWindow()
        }
    }
}


