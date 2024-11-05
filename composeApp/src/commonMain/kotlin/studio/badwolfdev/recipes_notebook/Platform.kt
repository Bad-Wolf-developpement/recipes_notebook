package studio.badwolfdev.recipes_notebook

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform