package com.example.myapplication.model

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BootEventDao {
    @Query("SELECT * FROM bootevent")
    fun getAll(): List<BootEvent>

    @Insert
    fun insertAll(vararg bootEvent: BootEvent)

    @Delete
    fun delete(bootEvent: BootEvent)
}