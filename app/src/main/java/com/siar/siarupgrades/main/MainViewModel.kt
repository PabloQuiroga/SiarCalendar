package com.siar.siarupgrades.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

/*****
 * Project: Siar Upgrades
 * Created by: Pablo Daniel Quiroga
 *****/
@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel(){

    private val _uiState = MutableStateFlow(SplashViewState())
    val uiState: StateFlow<SplashViewState> = _uiState.asStateFlow()


    init {
        viewModelScope.launch {
            delay(3000L)//mock actions on init
            _uiState.update {
                it.copy(
                    isReady = true
                )
            }
        }
    }

}
