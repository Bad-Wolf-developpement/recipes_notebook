package studio.badwolfdev.recipes_notebook.data.recipes

data class RecipesState(
    val recipes: List<Recipe> = emptyList(),
    val loading: Boolean = false,
    val error: String? = null
)