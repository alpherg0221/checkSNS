package com.example.checksns.ui.home

import android.app.Application
import android.content.Intent
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.checksns.service.ProxyService

class HomeViewModel(application: Application) : AndroidViewModel(application) {
    fun startServer() {
        val appContext = getApplication<Application>()
        val serviceIntent = Intent(appContext, ProxyService::class.java)
        appContext.startForegroundService(serviceIntent)
    }

    companion object {
        fun provideFactory(
            application: Application,
        ): ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return HomeViewModel(application) as T
            }
        }
    }
}