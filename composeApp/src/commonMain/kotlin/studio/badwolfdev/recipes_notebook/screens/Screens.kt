package studio.badwolfdev.recipes_notebook.screens

enum class Screens(
    val route: String
){
    MAIN("main"),
    ABOUT("about"),
    START(MAIN.route)

}