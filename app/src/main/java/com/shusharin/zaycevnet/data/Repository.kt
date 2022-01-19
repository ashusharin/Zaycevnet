package com.shusharin.zaycevnet.data

import com.shusharin.zaycevnet.core.Cache

interface Repository {

    fun openNumber(): Int


    class Base(private val cache: Cache) : Repository {
        override fun openNumber() = cache.read()
    }
}
