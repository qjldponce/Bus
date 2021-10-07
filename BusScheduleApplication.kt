package com.example.bus

import android.app.Application
import com.example.bus.database.BusDatabase

class BusScheduleApplication : Application() {
    val database: BusDatabase by lazy { BusDatabase.getDatabase(this)}
}