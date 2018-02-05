package koma.gui.view.window.chatroom.messaging.reading.display.room_event.m_message.content

import javafx.beans.property.SimpleBooleanProperty
import javafx.scene.control.Alert
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.stage.FileChooser
import koma.matrix.event.room_message.chat.ImageMessage
import koma.network.media.getFileByMxc
import koma.storage.config.settings.AppSettings
import kotlinx.coroutines.experimental.launch
import tornadofx.*
import java.io.File

fun m_image(content: ImageMessage): ImageView{
    val imageView = ImageView()

    imageView.isPreserveRatio = true
    imageView.tooltip(content.body)
    val scale = AppSettings.settings.scaling
    imageView.fitWidth = 320.0 * scale
    imageView.fitHeight = 320.0 * scale
    imageView.isSmooth = true

    val imageAvailable = SimpleBooleanProperty(false)
    var file: File? = null
    imageView.lazyContextmenu {
        item("Save Image"){
            disableWhen { !imageAvailable }
            action {
                if (file == null)
                    alert(Alert.AlertType.ERROR, "Image file unavailable")
                else {
                    saveImageAs(file!!, content.body)
                }
            }
        }
    }
    launch {
        val f = getFileByMxc(content.url)
        if (f != null) {
            file = f
            imageAvailable.set(true)
            imageView.image = Image(f.inputStream())
        }
    }
    return imageView
}

fun saveImageAs(image: File, name: String) {
    val dialog = FileChooser()
    dialog.title = "Save image as"
    dialog.initialFileName = name

    val file = dialog.showSaveDialog(FX.primaryStage)
    file?:return

    image.copyTo(file, true)
}