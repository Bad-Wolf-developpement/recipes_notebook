package studio.badwolfdev.recipes_notebook

import java.awt.Toolkit
import java.util.logging.Level
import java.util.logging.Logger


private val logger = Logger.getLogger("Recipes Notebook")

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class Platform {
    actual val osName: String
        get() = System.getProperty("os.name") ?: "Unknown"
    actual val osVersion: String
        get() = System.getProperty("os.version") ?: "Unknown"
    actual val deviceModel: String
        get() = System.getProperty("os.arch")
    actual val density: Int
        get() {
            val toolkit = Toolkit.getDefaultToolkit()
            return toolkit.screenResolution
        }
    actual val appVersion: String
        get()= "Unknown"

    actual fun logSystemInfo() {
        logger.log(
            Level.FINE,
            "($osName, $osVersion, $deviceModel, $density, $appVersion)"
        )
    }


}