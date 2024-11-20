package studio.badwolfdev.recipes_notebook.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import org.jetbrains.compose.resources.stringResource
import recipesnotebook.composeapp.generated.resources.Res
import recipesnotebook.composeapp.generated.resources.app_name
import studio.badwolfdev.recipes_notebook.data.recipes.RecipesViewModel
import studio.badwolfdev.recipes_notebook.presentation.TopAppBar


import studio.badwolfdev.recipes_notebook.screens.about.AboutScreen
import studio.badwolfdev.recipes_notebook.screens.main.MainScreen

@Composable
actual fun AppScaffold(
) {
    val recipesViewModel = RecipesViewModel()
    var currentScreen by remember { mutableStateOf(Screens.START.route) }
    Column {
        TopAppBar(
            //scope = scope,
            //drawerState = drawerState,
            title = stringResource(
                Res.string.app_name
            ),
            onSettingsCallback = {

            },
            onAboutCallback = {
                currentScreen = Screens.ABOUT.route
            }
        )
        Scaffold { paddingValues ->
            when (currentScreen) {
                Screens.MAIN.route -> {
                    MainScreen(recipesViewModel)
                }

                Screens.ABOUT.route -> {
                    AboutScreen(
                        onArrowBackCallback = {
                            currentScreen = Screens.MAIN.route
                        }
                    )
                }

            }
        }
    }
}