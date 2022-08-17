package com.app.tft.presentation.main.component

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.app.tft.data.route.RouterEnum

@Preview
@Composable
fun composeServerScreen() {
    ServerList()
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ServerList(

) {
    val options = RouterEnum.values()
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(options[0].server) }

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded }
    ) {

        OutlinedTextField(
            readOnly = true,
            value = selectedOptionText,
            onValueChange = { },
            label = { Text("Server") },
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(
                    expanded = expanded
                )
            },
            colors = ExposedDropdownMenuDefaults.textFieldColors()
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = {
                expanded = false
            }
        ) {
            options.forEach { selectionOption ->
                DropdownMenuItem(
                    onClick = {
                        selectedOptionText = selectionOption.server
                        expanded = false
                    }
                ) {
                    Text(text = selectionOption.server,
                        overflow = TextOverflow.Ellipsis)
                }
            }
        }
    }
}