package studio.badwolfdev.recipes_notebook.data.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual open class BaseViewModel: ViewModel() {
    actual val scope: CoroutineScope = viewModelScope
}