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
            profileIconId = summoner.profileIconId,
            name = summoner.name,
            revisionDate = summoner.revisionDate,
            summonerLevel = summoner.summonerLevel
        )
    }

    fun toSummoner(summonerEntity: SummonerEntity): Summoner {
        return Summoner(
            sid = summonerEntity.sid,
            accountId = summonerEntity.accountId,
            puuid =  summonerEntity.puuid,
            profileIconId = summonerEntity.profileIconId,
            name = summonerEntity.name,
            revisionDate = summonerEntity.revisionDate,
            summonerLevel = summonerEntity.summonerLevel
        )
    }
}