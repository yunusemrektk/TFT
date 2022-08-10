package com.app.tft.data.repository

import com.app.tft.data.db.dao.SummonerDAO
import com.app.tft.data.db.mapper.SummonerMapper
import com.app.tft.domain.model.Summoner
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SummonerDataSourceImpl @Inject constructor(
    private val summonerDAO: SummonerDAO,
    private val summonerMapper: SummonerMapper
): SummonerDataSource{
    override suspend fun insertSummoner(summoner: Summoner) {
        summonerDAO.insert(summonerMapper.toSummonerEntity(summoner))
    }

    override suspend fun deleteSummoner(summoner: Summoner) {
        summonerDAO.delete(summonerMapper.toSummonerEntity(summoner))
    }

    override suspend fun getAllSummoner(): List<Summoner> {
        val retList = ArrayList<Summoner>()
        summonerDAO.getAllSummoner().let { it ->
            it.forEach {
                retList.add(summonerMapper.toSummoner(it))
            }
        }
        return retList
    }

    override suspend fun getSummonerByName(name: String): Summoner {
        return summonerMapper.toSummoner(summonerDAO.getSummonerByName(name))
    }


}
