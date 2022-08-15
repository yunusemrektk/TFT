package com.app.tft.data.repository

import com.app.tft.data.db.dao.SummonerDAO
import com.app.tft.data.db.mapper.SummonerMapper
import com.app.tft.domain.model.Summoner
import com.app.tft.domain.repository.SummonerDbRepository
import javax.inject.Inject

class SummonerDbImpl @Inject constructor(
    private val summonerDAO: SummonerDAO,
    private val summonerMapper: SummonerMapper
) : SummonerDbRepository {

    override fun insertSummoner(summoner: Summoner) {
        val result = getSummonerByName(summoner.name)
        if(result.name.isBlank()) {
           return summonerDAO.insert(summonerMapper.toSummonerEntity(summoner))
        }
    }

    override fun deleteSummoner(summoner: Summoner) {
        return summonerDAO.delete(summonerMapper.toSummonerEntity(summoner))
    }

    override fun getAllSummoner(): List<Summoner> {
        return summonerDAO.getAllSummoner().map {
            Summoner(it.sid,it.accountId, it.puuid, it.name,
                it.profileIconId, it.revisionDate, it.summonerLevel) }

    }

    override fun getSummonerByName(name: String): Summoner {
        return summonerMapper.toSummoner(summonerDAO.getSummonerByName(name))
    }
}