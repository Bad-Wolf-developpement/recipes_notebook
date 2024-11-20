package studio.badwolfdev.recipes_notebook.data.recipes

import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.number
import kotlinx.datetime.toLocalDateTime


data class Recipe(
    var title: String,
    var ingredients: MutableList<Ingredient>,
    var steps: RecipeSteps,
    var imageUrl: String? = null,
    val source: String? = null
    //val Notes: TODO Later
){
    private var _lastChanged: Long = -1
    init{
        updateLastChanged()
    }

    private fun updateLastChanged(){
        _lastChanged = generateLastChanged(lastChanged)
    }

    private fun generateLastChanged(lastChanged: Long): Long {
        val currentMoment = Clock.System.now()
        val tz = TimeZone.currentSystemDefault()
        val currentDateTime = currentMoment.toLocalDateTime(tz)
        val year = currentDateTime.date.year
        val month = currentDateTime.date.month.number
        val day = currentDateTime.date.dayOfMonth

        return if (lastChanged.toString().startsWith("${year}${month}${day}")){
            _lastChanged + 1
        } else{
            "${year}${month}${day}001".toLong()
        }
    }

    val lastChanged: Long
            get() {
                return _lastChanged
            }
}
