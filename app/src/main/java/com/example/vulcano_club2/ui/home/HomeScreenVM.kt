package com.example.vulcano_club2.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.vulcano_club2.base.BaseVM
import com.example.vulcano_club2.utils.SingleLiveEvent

class HomeScreenVM : BaseVM() {
    private var _homeLiveData = SingleLiveEvent<Unit>()
    val homeLiveData: LiveData<Unit> get() = _homeLiveData

    fun navController() {
        _homeLiveData.value = Unit
    }
}