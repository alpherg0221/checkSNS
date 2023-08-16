package com.example.checksns

import android.app.Application
import com.example.checksns.data.Container
import com.example.checksns.data.ContainerImpl

class Application: Application() {
    lateinit var container: Container

    override fun onCreate() {
        super.onCreate()
        container = ContainerImpl(this)
    }
}