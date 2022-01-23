package com.example.vulcano_club2.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.vulcano_club2.base.BaseVM
import com.example.vulcano_club2.utils.SingleLiveEvent
import kotlinx.coroutines.delay

class SplashViewModel : BaseVM() {

    private val _homeSceenLiveData = SingleLiveEvent<Unit>()
    val homeSceenLiveData: LiveData<Unit> = _homeSceenLiveData

    private val _loginSceenLiveData = SingleLiveEvent<Unit>()
    val loginSceenLiveData: LiveData<Unit> = _loginSceenLiveData


    init {
        launchVM {
            delay(3000)
//            if (appCache.token.isNullOrBlank())
//                _loginScreenLiveData.value = Unit
//            else
//                _homeScreenLiveData.value = Unit
        }
    }
}