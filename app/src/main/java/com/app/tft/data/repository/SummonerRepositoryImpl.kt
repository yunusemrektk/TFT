package com.app.tft.data.repository

import com.app.tft.data.remote.api.RiotApi
import com.app.tft.data.remote.dto.user.toSummoner

import com.app.tft.domain.model.Summoner
import com.app.tft.domain.repository.SummonerRemoteRepository
import javax.inject.Inject

class SummonerRepositoryImpl @Inject constructor(
    private val api: RiotApi
) : SummonerRemoteRepository {

    override suspend fun getSummonerByName(name: String): Summoner {
        return api.getSummonerByName(name).toSummoner()
    }
}