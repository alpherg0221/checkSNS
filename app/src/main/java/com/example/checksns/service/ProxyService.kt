package com.example.checksns.service

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import com.example.checksns.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import proxy.Proxy.startProxy

class ProxyService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        throw NotImplementedError("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val id = "proxy_service"

        if (manager.getNotificationChannel(id) == null) {
            val channel = NotificationChannel(id, id, NotificationManager.IMPORTANCE_HIGH)
            manager.createNotificationChannel(channel)
        }

        val notification: Notification = NotificationCompat.Builder(this, id).apply {
            setSmallIcon(R.mipmap.ic_launcher_round)
            setContentTitle("checkSNS")
            setContentText("checkSNS")
        }.build()

        startForeground(1, notification)

        runBlocking {
            withContext(Dispatchers.IO) { startProxy() }
        }

        return START_STICKY
    }
}