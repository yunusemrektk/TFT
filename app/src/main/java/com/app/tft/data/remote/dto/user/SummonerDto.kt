package com.app.tft.data.remote.dto.user

import com.app.tft.domain.model.Summoner

data class SummonerDto(
    val id: String,
    val accountId: String,
    val puuid: String,
    val name: String,
    val profileIconId: Int,
    val revisionDate: Long,
    val summonerLevel: Int
)

fun SummonerDto.toSummoner(): Summoner {
    return Summoner(id, accountId, puuid, name, profileIconId, revisionDate, summonerLevel)
}