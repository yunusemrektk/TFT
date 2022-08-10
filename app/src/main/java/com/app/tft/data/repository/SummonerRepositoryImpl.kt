package com.app.tft.data.repository

import com.app.tft.data.remote.api.RiotApi
import com.app.tft.data.remote.dto.user.toSummoner

import com.app.tft.domain.model.Summoner
import com.app.tft.domain.repository.SummonerRepository
import javax.inject.Inject

class SummonerRepositoryImpl @Inject constructor(
    private val api: RiotApi
) : SummonerRepository {

    override suspend fun getSummonerByName(name: String): Summoner {
        return api.getSummonerByName(name).toSummoner()
    }
}