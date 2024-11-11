package studio.badwolfdev.recipes_notebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.stringResource
import recipesnotebook.composeapp.generated.resources.Res
import recipesnotebook.composeapp.generated.resources.app_name
import studio.badwolfdev.recipes_notebook.presentation.TopAppBar
import studio.badwolfdev.recipes_notebook.screens.AppScaffold

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}