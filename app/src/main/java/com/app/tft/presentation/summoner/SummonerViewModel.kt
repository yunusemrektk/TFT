package com.app.tft.presentation.summoner

import android.os.AsyncTask
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.tft.data.route.Router
import com.app.tft.data.route.RouterEnum
import com.app.tft.domain.model.Summoner
import com.app.tft.domain.repository.SummonerDbRepository
import com.app.tft.domain.repository.SummonerRemoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SummonerViewModel @Inject constructor(
    private val remoteRepository: SummonerRemoteRepository,
    private val localRepository: SummonerDbRepository
) : ViewModel() {

    var state by mutableStateOf(SummonerState())
        private set

    fun loadSummonerInfo(name: String) {
        try {
            viewModelScope.launch {
                state = state.copy(isLoading = true)
                //TODO Get  router from main page
                //TODO Get  router from main page
                remoteRepository.getSummonerByName(Router.fromIndex(RouterEnum.TR1),name).let {
                    state = state.copy(isLoading = false, summoner = it, error = null)
                    saveSummoner(it)
                }
            }
        }catch (e: Exception) {
            e.printStackTrace()
            state = state.copy(isLoading = false, summoner = null, error = e.toString())
        }

    }

    private fun saveSummoner(summoner: Summoner) {

        localRepository.insertSummoner(summoner)
        val sum = localRepository.getSummonerByName(summoner.name)

        // Insert Data


    }

}