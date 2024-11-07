package studio.badwolfdev.recipes_notebook.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DrawerState
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.vectorResource
import recipesnotebook.composeapp.generated.resources.Res
import recipesnotebook.composeapp.generated.resources.compose_multiplatform
import recipesnotebook.composeapp.generated.resources.ic_filter_list


@Composable
fun TopAppBar(
    scope: CoroutineScope,
    drawerState: DrawerState,
    title: String,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        modifier = modifier,
        backgroundColor = Color.LightGray, // TODO use color var for theming
//contentColor = Color.White, // TODO change this for color var for theming
        elevation = 4.dp,
        navigationIcon = {
            IconButton(
                onClick = {
                    scope.launch {
                        if (drawerState.isClosed) drawerState.open()
                        else drawerState.close()
                    }
                }
            ) {
                Icon(
                    painter = painterResource(
                       Res.drawable.ic_filter_list
                    ),
                    contentDescription = "Open Drawer"
                )
            }
        },
        title = {
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(title)
            }
        }, // TODO change this to string res
        actions = {
            IconButton(
                onClick = { /* TODO */ }
            ){
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                )
            }
            IconButton(
                onClick = { /* TODO */ }
            ){
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }
            IconButton(
                onClick = { /* TODO */ }
            ){
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = null
                )
            }
        }
    )
}