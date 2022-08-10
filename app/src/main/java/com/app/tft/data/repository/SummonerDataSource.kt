package com.app.tft.data.repository

import com.app.tft.domain.model.Summoner

interface SummonerDataSource {
    suspend fun insertSummoner(summoner: Summoner)

    suspend fun deleteSummoner(summoner: Summoner)

    suspend fun getAllSummoner(): List<Summoner>

    suspend fun getSummonerByName(name: String): Summoner
}