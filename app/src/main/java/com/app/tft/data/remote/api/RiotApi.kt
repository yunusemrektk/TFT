package com.app.tft.data.remote.api

import com.app.tft.BuildConfig
import com.app.tft.data.remote.dto.user.SummonerDto
import retrofit2.http.*

interface RiotApi {

    @GET()
    suspend fun getSummonerByName(
        @Url url: String
    ): SummonerDto


}