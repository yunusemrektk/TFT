package com.app.tft.data.repository

import com.app.tft.BuildConfig
import com.app.tft.common.Constants
import com.app.tft.data.remote.api.RiotApi
import com.app.tft.data.remote.dto.user.toSummoner
import com.app.tft.data.route.Router

import com.app.tft.domain.model.Summoner
import com.app.tft.domain.repository.SummonerRemoteRepository
import javax.inject.Inject

class SummonerRepositoryImpl @Inject constructor(
    private val api: RiotApi
) : SummonerRemoteRepository {

    override suspend fun getSummonerByName(router: Router, username: String): Summoner {
        val url = "${router.baseUrl}${Constants.summoner}$username?api_key=${BuildConfig.API_KEY}"
        return api.getSummonerByName(url).toSummoner()
    }
}