package com.app.tft.domain.repository

import com.app.tft.domain.model.Summoner


interface SummonerDbRepository {

    fun insertSummoner(summoner: Summoner)

    fun deleteSummoner(summoner: Summoner)

    fun getAllSummoner(): List<Summoner>

    fun getSummonerByName(name: String): Summoner
}