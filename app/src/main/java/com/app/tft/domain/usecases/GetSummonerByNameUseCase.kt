package com.app.tft.domain.usecases

import com.app.tft.domain.repository.SummonerDbRepository

class GetSummonerByNameUseCase (private val summonerDbRepository: SummonerDbRepository) {
    suspend operator fun invoke(name: String) = summonerDbRepository.getSummonerByName(name)
}