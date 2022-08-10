package com.app.tft.domain.repository

import com.app.tft.domain.model.Summoner


interface SummonerDbRepository {

    suspend fun insertSummoner(summoner: Summoner)

    suspend fun deleteSummoner(summoner: Summoner)

    suspend fun getAllSummoner(): List<Summoner>

    suspend fun getSummonerByName(name: String): Summoner
}