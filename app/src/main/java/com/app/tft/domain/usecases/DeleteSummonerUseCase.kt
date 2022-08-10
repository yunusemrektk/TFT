package com.app.tft.domain.usecases

import com.app.tft.domain.model.Summoner
import com.app.tft.domain.repository.SummonerDbRepository
import javax.inject.Inject

class DeleteSummonerUseCase @Inject constructor(
        private val summonerDbRepository: SummonerDbRepository
    ) {
        suspend operator fun invoke(summoner: Summoner) {
          summonerDbRepository.deleteSummoner(summoner)
        }
}