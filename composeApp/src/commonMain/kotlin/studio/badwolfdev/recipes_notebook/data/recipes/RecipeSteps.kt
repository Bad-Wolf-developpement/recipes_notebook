package studio.badwolfdev.recipes_notebook.data.recipes

data class RecipeSteps(
    var steps: MutableList<RecipeStep> = mutableListOf()
){
    fun addStep(
        step: RecipeStep
    ){
        if (steps.size == 0){
            step.position = 1
            steps.add(step)
        }else{
            steps.forEach { s ->
                if (s.position >= step.position){
                    s.position ++
                }
            }
            steps.add(step)
        }
    }

    fun removeStep(
        step: RecipeStep
    ){
        if (step !in steps){
            throw RuntimeException("step not in steps")
        }
        steps.forEach { s ->
            if (s.position > step.position){
                s.position --
            }
        }
        steps.remove(step)
    }
}
