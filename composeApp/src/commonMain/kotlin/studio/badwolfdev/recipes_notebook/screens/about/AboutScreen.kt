package studio.badwolfdev.recipes_notebook.screens.about


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import studio.badwolfdev.recipes_notebook.Platform


@Composable
fun AboutScreen(
    onArrowBackCallback: () -> Unit
){
    ContentView(onArrowBackCallback)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ContentView(
    onArrowBackCallback: () -> Unit,
    modifier: Modifier = Modifier
){
    val items = makeItems()

    Column {
        TopAppBar(
            title = { Text("About") },
            navigationIcon = {
                IconButton(
                    onClick = onArrowBackCallback
                ){
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = ""
                    )
                }
            }
        )
        LazyColumn(
            modifier = modifier
        ) {

            items(items) { row ->
                RowView(title = row.first, subtitle = row.second)
            }
        }
    }
}

@Composable
private fun RowView(
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .padding(8.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray // TODO change to resource
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodyLarge
        )
    }
    HorizontalDivider()
}

private fun makeItems(): List<Pair<String, String>>{
    val platform = Platform()

    platform.logSystemInfo()

     return listOf(
         Pair("Operating System", "${platform.osName}, ${platform.osVersion}"),
         Pair("Device", platform.deviceModel),
         Pair("Density", platform.density.toString()),
         Pair("App Version", platform.appVersion)
     )

}