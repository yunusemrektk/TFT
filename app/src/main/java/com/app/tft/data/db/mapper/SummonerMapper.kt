package com.app.tft.data.db.mapper

import com.app.tft.data.db.entity.SummonerEntity
import com.app.tft.domain.model.Summoner
import javax.inject.Inject

class SummonerMapper {
    fun toSummonerEntity(summoner: Summoner): SummonerEntity {
        return SummonerEntity(
            sid = summoner.sid,
            accountId = summoner.accountId,
            puuid =  summoner.puuid,
            name = summoner.name,
            profileIconId = summoner.profileIconId,
            revisionDate = summoner.revisionDate,
            summonerLevel = summoner.summonerLevel
        )
    }

    fun toSummoner(summonerEntity: SummonerEntity): Summoner {
        return Summoner(
            sid = summonerEntity.sid,
            accountId = summonerEntity.accountId,
            puuid =  summonerEntity.puuid,
            name = summonerEntity.name,
            profileIconId = summonerEntity.profileIconId,
            revisionDate = summonerEntity.revisionDate,
            summonerLevel = summonerEntity.summonerLevel
        )
    }
}