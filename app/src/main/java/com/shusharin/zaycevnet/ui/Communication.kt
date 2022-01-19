package com.shusharin.zaycevnet.ui

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer

interface Communication  {
    fun map(shouldToast : Boolean)
    fun observe(owner: LifecycleOwner, observer: Observer<Boolean>)

    class Base : Communication {
        private val LiveData = MutableLiveData<Boolean>()
        override fun observe(owner: LifecycleOwner, observer: Observer<Boolean>) {
            LiveData.observe(owner, observer)
        }

        override fun map(shouldToast: Boolean) {
            LiveData.value = shouldToast
        }
    }
}