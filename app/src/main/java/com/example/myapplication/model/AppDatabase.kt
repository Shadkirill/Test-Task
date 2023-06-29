package com.example.myapplication.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [BootEvent::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bootEventDao(): BootEventDao
}