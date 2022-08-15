package com.app.tft.domain.repository

import com.app.tft.domain.model.Summoner

interface SummonerRemoteRepository {
    suspend fun getSummonerByName(city: String): Summoner
}