package com.shusharin.zaycevnet.domain

import com.shusharin.zaycevnet.data.Repository

interface Interactor {

    fun shouldToast(): Boolean

    class Base(private val repository: Repository) : Interactor {
        override fun shouldToast(): Boolean = repository.openNumber() == 3
    }
}