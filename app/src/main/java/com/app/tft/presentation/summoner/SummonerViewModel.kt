package com.app.tft.presentation.summoner

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.tft.domain.repository.SummonerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class SummonerViewModel @Inject constructor(
    private val repository: SummonerRepository
) : ViewModel() {

    var state by mutableStateOf(SummonerState())
        private set


    fun loadSummonerInfo(name: String) {
            viewModelScope.launch {
                state = state.copy(isLoading = true)
                repository.getSummonerByName(name).let {
                    state = state.copy(isLoading = false, summoner = it, error = null)
                }
            }


    }


}