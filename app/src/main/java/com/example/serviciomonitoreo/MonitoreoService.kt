package com.example.serviciomonitoreo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MonitoreoService: Service() {
    private val TAG: String = "MiServicio"
    init {
       Log.d(TAG,"Service running...")
    }
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate...")
    }
    override fun onBind(intent: Intent?): IBinder? = null
    override fun onDestroy() {
        super.onCreate()
        Log.d(TAG, "Service destroyed...")
    }




}