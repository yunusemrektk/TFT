package com.app.tft.data.remote.dto.user

import com.app.tft.domain.model.Summoner

data class SummonerDto(
    val accountId: String,
    val id: String,
    val name: String,
    val profileIconId: Int,
    val puuid: String,
    val revisionDate: Long,
    val summonerLevel: Int
)

fun SummonerDto.toSummoner(): Summoner {
    return Summoner(accountId, id, name, profileIconId, puuid, revisionDate, summonerLevel)
}