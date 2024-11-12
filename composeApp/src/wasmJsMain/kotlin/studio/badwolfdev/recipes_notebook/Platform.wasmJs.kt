package studio.badwolfdev.recipes_notebook

import kotlinx.browser.window


@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Platform {
    actual val osName: String
        get() = window.navigator.platform
    actual val osVersion: String
        get() = window.navigator.userAgent
    actual val deviceModel: String
        get() = "Web Browser"
    actual val density: Int
        get() = -1
    actual val appVersion: String
        get() = "unknown"

    actual fun logSystemInfo() {

    }
}

