package com.app.tft.data.remote.api

import com.app.tft.BuildConfig
import com.app.tft.common.Constants
import com.app.tft.data.remote.dto.user.SummonerDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface RiotApi {

    @GET("lol/summoner/v4/summoners/by-name/{name}")
    suspend fun getSummonerByName(
        @Path("name") name: String,
        @Query("api_key") apiKey: String = BuildConfig.API_KEY,
    ): SummonerDto


}