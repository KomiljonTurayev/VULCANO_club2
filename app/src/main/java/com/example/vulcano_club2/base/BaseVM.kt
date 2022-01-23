package com.example.vulcano_club2.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vulcano_club2.utils.SingleLiveEvent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

abstract class BaseVM : ViewModel() {

    private val _globalErrorLiveData = SingleLiveEvent<String>()
    val globalErrorLiveData: LiveData<String> = _globalErrorLiveData

    protected val _loadingLiveData = MutableLiveData<Unit>()
    val loadingLiveData: LiveData<Unit> = _loadingLiveData

    protected val _emptyLiveData = MutableLiveData<String>()
    val emptyLiveData: LiveData<String> = _emptyLiveData

    protected val _connectLiveData = MutableLiveData<Boolean>()
    val connectLiveData: LiveData<Boolean> = _connectLiveData
    protected fun launchVM(
        context: CoroutineContext = EmptyCoroutineContext,
        start: CoroutineStart = CoroutineStart.DEFAULT,
        block: suspend CoroutineScope.() -> Unit
    ): Job = viewModelScope.launch(context, start, block)

    protected fun globalError(error: Throwable) {
        _globalErrorLiveData.value = error.message
    }
}