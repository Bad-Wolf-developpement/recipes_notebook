package studio.badwolfdev.recipes_notebook.data.view_model

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual open class BaseViewModel {
    actual val scope: CoroutineScope = CoroutineScope(Dispatchers.Default)
}