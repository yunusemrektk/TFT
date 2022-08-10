package com.app.tft.domain.usecases

import com.app.tft.domain.model.Summoner
import com.app.tft.domain.repository.SummonerDbRepository

class InsertSummonerUseCase (private val summonerDbRepository: SummonerDbRepository) {
    suspend operator fun invoke(summoner: Summoner) = summonerDbRepository.insertSummoner(summoner)
}