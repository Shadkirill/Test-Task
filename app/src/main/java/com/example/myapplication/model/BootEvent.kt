package com.example.myapplication.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BootEvent(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "timestamp") val timestamp: Long
)