package studio.badwolfdev.recipes_notebook.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.stringResource
import recipesnotebook.composeapp.generated.resources.Res
import recipesnotebook.composeapp.generated.resources.app_name
import studio.badwolfdev.recipes_notebook.presentation.TopAppBar
import studio.badwolfdev.recipes_notebook.screens.about.AboutScreen
import studio.badwolfdev.recipes_notebook.screens.main.MainScreen

@Composable
actual fun AppScaffold(
) {

    val navController = rememberNavController()
    Column {
        TopAppBar(
        //scope = scope,
        //drawerState = drawerState,
            title = stringResource(
                Res.string.app_name,
            ),
            onSettingsCallback = {},
            onAboutCallback = {
                navController.navigate(Screens.ABOUT.route)
            }
        )
        Scaffold(
        ) { paddingValues ->
            AppNavHost(
                navController = navController,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            )
        }
    }
}

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController = navController,
        startDestination = Screens.START.route

    ){
        composable(Screens.MAIN.route){
            MainScreen()
        }
        composable(Screens.ABOUT.route){
            AboutScreen(
                onArrowBackCallback = {
                    navController.popBackStack()
                }
            )
        }
    }
}