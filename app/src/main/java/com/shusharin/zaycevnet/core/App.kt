package com.shusharin.zaycevnet.core

import android.app.Application
import com.shusharin.zaycevnet.core.Cache
import com.shusharin.zaycevnet.data.Repository
import com.shusharin.zaycevnet.domain.Interactor
import com.shusharin.zaycevnet.ui.Communication
import com.shusharin.zaycevnet.ui.MainViewModel

class App : Application() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate() {
        super.onCreate()
        val cache = Cache.Base(this)
        val counter = Counter.Base(cache)
        val number = counter.getCounter()
        counter.save(number)
        val communication = Communication.Base()
        val repository = Repository.Base(cache)
        val interactor = Interactor.Base(repository)
        mainViewModel = MainViewModel(
            communication, interactor
        )
    }
}