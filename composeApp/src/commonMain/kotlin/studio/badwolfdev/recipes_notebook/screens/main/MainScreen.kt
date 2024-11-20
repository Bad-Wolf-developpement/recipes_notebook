package studio.badwolfdev.recipes_notebook.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import studio.badwolfdev.recipes_notebook.data.recipes.RecipesViewModel

@Composable
fun MainScreen(
    recipeViewModel: RecipesViewModel
){
    Column {
        Text("${recipeViewModel.recipeState.value.recipes}")
    }
}