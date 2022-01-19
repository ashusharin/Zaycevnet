package com.shusharin.zaycevnet.ui

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.shusharin.zaycevnet.domain.Interactor

class MainViewModel(
    private val communication: Communication,
    private val interactor: Interactor,
) : ViewModel() {

    fun makeToast() {
        val a = interactor.shouldToast()
        communication.map(a)
    }

    fun observe(owner: LifecycleOwner, observer: Observer<Boolean>) {
        communication.observe(owner, observer)
    }
}