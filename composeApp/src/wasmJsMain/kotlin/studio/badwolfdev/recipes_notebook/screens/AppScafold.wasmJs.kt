package studio.badwolfdev.recipes_notebook.screens

import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import studio.badwolfdev.recipes_notebook.screens.about.AboutScreen
import studio.badwolfdev.recipes_notebook.screens.main.MainScreen

@Composable
actual fun AppScaffold() {
    val currentScreen by remember { mutableStateOf(Screens.START.route) }
    Scaffold { paddingValue ->
        when (currentScreen){
            Screens.MAIN.route -> {
                MainScreen()
            }
            Screens.ABOUT.route -> {
                AboutScreen()
            }
        }
    }

}