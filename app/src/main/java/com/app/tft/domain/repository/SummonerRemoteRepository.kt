package com.app.tft.domain.repository

import com.app.tft.data.route.Router
import com.app.tft.domain.model.Summoner

interface SummonerRemoteRepository {
    suspend fun getSummonerByName(router: Router, city: String): Summoner
}