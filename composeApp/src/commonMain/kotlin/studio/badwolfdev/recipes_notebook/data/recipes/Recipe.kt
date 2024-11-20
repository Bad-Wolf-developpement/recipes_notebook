package studio.badwolfdev.recipes_notebook.data.recipes

import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime


data class Recipe(
    var title: String,
    var ingredients: MutableList<Ingredient>,
    var steps: RecipeSteps,
    var imageUrl: String? = null,
    val source: String? = null
    //val Notes: TODO Later
){
    private var _lastChanged: Int = -1
    init{
        updateLastChanged()
    }

    private fun updateLastChanged(){
        _lastChanged = generateLastChanged(lastChanged)
    }

    private fun generateLastChanged(lastChanged: Int): Int{
        val currentMoment = Clock.System.now()
        val tz = TimeZone.currentSystemDefault()
        val currentDateTime = currentMoment.toLocalDateTime(tz)
        val year = currentDateTime.date.year
        val month = currentDateTime.date.month
        val day = currentDateTime.date.dayOfMonth

        return if (lastChanged.toString().startsWith("${year}${month}${day}")){
            _lastChanged + 1
        } else{
            "${year}${month}${day}001".toInt()
        }
    }

    val lastChanged: Int
            get() {
                return _lastChanged
            }
}
