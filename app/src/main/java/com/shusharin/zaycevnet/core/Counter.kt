package com.shusharin.zaycevnet.core

interface Counter {

    fun getCounter(): Int
    fun save(data: Int)


    class Base(private val cache: Cache) : Counter {

        override fun getCounter(): Int = cache.read()

        override fun save(data: Int) = cache.save(data.plus(1))

    }
}