package com.app.tft.presentation.main

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.tft.presentation.main.component.ServerList

@Preview
@Composable
fun composeMainScreen() {
    MainScreen()
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainScreen(

) {
    var text by rememberSaveable { mutableStateOf("") }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .offset(y = 100.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            TextField(
                value = text,
                onValueChange = {
                    text = it
                },
                label = { Text("Username")} ,
                singleLine = true
            )
            ServerList()
            Button(onClick = { /*TODO*/ },
           ) {
                Text("Okey")
            }
        }
    }

}