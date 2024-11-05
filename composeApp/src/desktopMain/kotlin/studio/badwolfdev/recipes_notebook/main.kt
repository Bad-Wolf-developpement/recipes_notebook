package studio.badwolfdev.recipes_notebook

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val state = rememberWindowState() // default windows configuration
    Window(
        state = state,
        onCloseRequest = ::exitApplication,
        title = "recipes_notebook", // TODO change this to res strings
        //icon = Painter?, TODO Add icon to the windows

    ) {
        App()
    }
}