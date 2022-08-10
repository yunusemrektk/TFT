package com.app.tft.presentation.summoner

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp


@Composable
fun SummonerScreen(
    state: SummonerState
) {
    state.summoner?.let { data ->
        Box(
            modifier = Modifier
                .fillMaxSize()
        )
        {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)

            ) {
                Text(
                    text = data.sid,
                    style = MaterialTheme.typography.h5,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.Black
                )
                Text(
                    text = data.name,
                    style = MaterialTheme.typography.h5,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.Black
                )

                Text(
                    text = data.accountId,
                    style = MaterialTheme.typography.h5,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.Black
                )

                Text(
                    text = "${data.summonerLevel}",
                    style = MaterialTheme.typography.h6,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.Black
                )
            }
        }
    }
}