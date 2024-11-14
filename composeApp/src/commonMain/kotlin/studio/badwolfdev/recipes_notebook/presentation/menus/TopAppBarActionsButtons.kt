package studio.badwolfdev.recipes_notebook.presentation.menus

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopAppBarActionButtons(
    moreMenuState: MutableState<Boolean>,
    onAboutCallback: () -> Unit
){
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
        onClick = {
            moreMenuState.value = !moreMenuState.value
        }
    ){
        Box {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = null
            )
            if (moreMenuState.value){
                DropdownMenu(
                    modifier = Modifier
                        .width(100.dp),
                    expanded = moreMenuState.value,
                    onDismissRequest = { moreMenuState.value = !moreMenuState.value },
                ){
                    Text(
                        "Settings"
                        ,
                        modifier = Modifier
                            .clickable { /* TODO*/ }
                            .padding(5.dp)
                            .fillMaxWidth())
                    HorizontalDivider()
                    Text(
                        "About",
                        modifier = Modifier
                            .clickable {
                                onAboutCallback()
                                moreMenuState.value = !moreMenuState.value
                            }
                            .padding(5.dp)
                            .fillMaxWidth()
                    )
                }
            }
        }
    }
}