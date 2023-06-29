package com.example.myapplication

import android.app.Application
import androidx.room.Room

import androidx.work.PeriodicWorkRequest
import androidx.work.WorkManager
import com.example.myapplication.model.AppDatabase
import java.util.concurrent.TimeUnit


class App: Application() {

    lateinit var database: AppDatabase


    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-events"
        ).allowMainThreadQueries().build()
        val workManager = WorkManager.getInstance()
        val workRequest =
            PeriodicWorkRequest.Builder(OfflineNotificationsWorker::class.java, 15, TimeUnit.MINUTES).build()
        workManager.enqueue(workRequest)
    }
}