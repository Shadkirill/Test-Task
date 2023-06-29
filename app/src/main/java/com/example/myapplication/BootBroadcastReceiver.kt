package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.myapplication.model.BootEvent


class BootBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.action
        if (action != null) {
            if (action == Intent.ACTION_BOOT_COMPLETED) {
                (context.applicationContext as App)
                    .database
                    .bootEventDao()
                    .insertAll(
                        BootEvent(0, System.currentTimeMillis())
                    )
            }
        }
    }
}