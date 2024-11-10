package studio.badwolfdev.recipes_notebook.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import studio.badwolfdev.recipes_notebook.presentation.TopAppBar

@Composable
fun MainScreen(

){
    Column {
        TopAppBar(
            title = "TEMP TITLE"
        )

        Text("Main Screen")
    }
}