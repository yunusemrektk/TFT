package com.app.tft.presentation.summoner

import com.app.tft.domain.model.Summoner

data class SummonerState(
    val isLoading: Boolean = false,
    val summoner: Summoner? = null,
    val error: String? = null
)