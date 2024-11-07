package studio.badwolfdev.recipes_notebook

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import org.jetbrains.compose.resources.stringResource
import recipesnotebook.composeapp.generated.resources.Res
import recipesnotebook.composeapp.generated.resources.app_name

fun main() = application {
    val state = rememberWindowState() // default windows configuration
    Window(
        state = state,
        onCloseRequest = ::exitApplication,

        title = stringResource(
            Res.string.app_name
        ),
        //icon = Painter?, TODO Add icon to the windows
    ) {
        App()
    }
}