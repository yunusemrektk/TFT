package com.app.tft.data.repository

import com.app.tft.domain.model.Summoner
import com.app.tft.domain.repository.SummonerDbRepository
import javax.inject.Inject

class SummonerDbImpl @Inject constructor(
    private val summonerDataSource: SummonerDataSource
) : SummonerDbRepository {

    override suspend fun insertSummoner(summoner: Summoner) {
        return summonerDataSource.insertSummoner(summoner)
    }

    override suspend fun deleteSummoner(summoner: Summoner) {
        return summonerDataSource.deleteSummoner(summoner)
    }

    override suspend fun getAllSummoner(): List<Summoner> {
        return summonerDataSource.getAllSummoner()
    }

    override suspend fun getSummonerByName(name: String): Summoner {
        return summonerDataSource.getSummonerByName(name)
    }
}