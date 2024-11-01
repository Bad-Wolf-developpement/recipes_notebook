package studio.badwolfdev.recipes_notebook

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "recipes_notebook",
    ) {
        App()
    }
}