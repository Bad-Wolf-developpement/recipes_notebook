package studio.badwolfdev.recipes_notebook.data.recipes

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import studio.badwolfdev.recipes_notebook.data.view_model.BaseViewModel

class RecipesViewModel: BaseViewModel() {
    private val _recipesState: MutableStateFlow<RecipesState> =
        MutableStateFlow(
            RecipesState(
                loading = true
            )
        )

    val recipeState : StateFlow<RecipesState> get() = _recipesState

    fun getRecipes(){
        scope.launch {
            _recipesState.emit(
                RecipesState(
                    recipes = mockRecipes()
                )
            )
        }
    }
}

private fun mockRecipes(): List<Recipe>{
    val ingredient = Ingredient(
        ingredient = "Bread",
        quantity = 1
    )
    val step = RecipeStep(
        position = 1,
        description = "Toast the bread"
    )
    val steps = RecipeSteps()
    steps.addStep(step)
    val recipe = Recipe(
        title = "Toast",
        ingredients = mutableListOf(ingredient),
        steps = steps
    )

    return listOf(recipe)
}