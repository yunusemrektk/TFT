package com.app.tft.domain.usecases

import com.app.tft.domain.repository.SummonerDbRepository

class GetAllSummonerUseCase(private val summonerDbRepository: SummonerDbRepository) {

    suspend operator fun invoke() = summonerDbRepository.getAllSummoner()
}