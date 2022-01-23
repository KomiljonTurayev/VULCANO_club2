package com.example.vulcano_club2.ui.onboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.vulcano_club2.base.BaseVM
import com.example.vulcano_club2.utils.SingleLiveEvent

class OnBoardingVM : BaseVM() {
    private var _onBoardingLiveData = SingleLiveEvent<Unit>()
    val onBoardingLiveData: LiveData<Unit> get() = _onBoardingLiveData

    fun navController() {
        _onBoardingLiveData.value = Unit
    }
}