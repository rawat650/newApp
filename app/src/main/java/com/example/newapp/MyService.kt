package com.example.newapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService: Service() {
    val count:Int = 0
    class MyThread
    override fun  onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this,"serviceStarted",Toast.LENGTH_LONG).show()

        return super.onStartCommand(intent, flags, startId)
    }


    override fun onCreate() {
        super.onCreate()
        Toast.makeText(this,"service is created",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"service is destroy",Toast.LENGTH_LONG).show()
    }
    override fun onBind(p0: Intent?): IBinder? {
      return null
    }
}