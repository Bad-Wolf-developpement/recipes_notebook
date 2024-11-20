package studio.badwolfdev.recipes_notebook.data.recipes

data class Ingredient(
    var ingredient: String,
    var quantity: Float,
    var unit: String? = null // TODO Maybe add an enum of available unit or something like that
){
    constructor(
        ingredient: String,
        quantity: Int,
        unit: String? = null
    ) : this(ingredient, quantity.toFloat(), unit)
}