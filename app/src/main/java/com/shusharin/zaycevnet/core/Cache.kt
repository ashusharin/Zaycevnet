package com.shusharin.zaycevnet.core

import android.content.Context

interface Cache {
    fun save(data: Int)
    fun read(): Int


    class Base(context: Context) : Cache {

        private val sharedPreferences =
            context.getSharedPreferences(COUNTER_NUMBER_FILENAME, Context.MODE_PRIVATE)

        override fun save(data: Int) = sharedPreferences.edit().putInt(COUNTER, data).apply()
        override fun read(): Int = sharedPreferences.getInt(COUNTER, 0)
    }


    private companion object {
        const val COUNTER_NUMBER_FILENAME = "file"
        const val COUNTER = "counter"
    }


}