package studio.badwolfdev.recipes_notebook.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.painterResource
import recipesnotebook.composeapp.generated.resources.Res
import recipesnotebook.composeapp.generated.resources.ic_filter_list
import studio.badwolfdev.recipes_notebook.presentation.menus.TopAppBarActionButtons


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    //scope: CoroutineScope,
    //drawerState: DrawerState,
    title: String,
    onAboutCallback: () -> Unit,
    onSettingsCallback: () -> Unit,
    modifier: Modifier = Modifier
) {
    val moreMenuState = remember { mutableStateOf(false) }

    TopAppBar(
        modifier = modifier,
        colors = TopAppBarDefaults
            .topAppBarColors(
                containerColor = Color.LightGray
            ),
        navigationIcon = {
            IconButton(
                onClick = {
//                    scope.launch {
//                        if (drawerState.isClosed) drawerState.open()
//                        else drawerState.close()
//                    }
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
        },
        actions = {
            TopAppBarActionButtons(
                moreMenuState = moreMenuState,
                onAboutCallback = onAboutCallback,
                )
        }
    )
}
