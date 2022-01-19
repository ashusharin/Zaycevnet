package com.shusharin.zaycevnet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shusharin.zaycevnet.R
import com.shusharin.zaycevnet.core.App

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = (application as App).mainViewModel
        viewModel.makeToast()
        viewModel.observe(this, {shouldToast ->
            if (shouldToast) makeToast()
        })
    }


    private fun makeToast() {
        Toast.makeText(this, "3 запуск", Toast.LENGTH_LONG).show()

    }
}