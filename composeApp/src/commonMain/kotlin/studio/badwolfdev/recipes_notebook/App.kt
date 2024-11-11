package studio.badwolfdev.recipes_notebook

import androidx.compose.foundation.layout.Column
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import recipesnotebook.composeapp.generated.resources.Res
import recipesnotebook.composeapp.generated.resources.app_name
import studio.badwolfdev.recipes_notebook.presentation.TopAppBar
import studio.badwolfdev.recipes_notebook.screens.AppScaffold


@OptIn(ExperimentalMaterialApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        Column() {
            TopAppBar(
                //scope = scope,
                //drawerState = drawerState,
                title = stringResource(
                    Res.string.app_name
                ),
            )
            AppScaffold()
        }
    }
}
