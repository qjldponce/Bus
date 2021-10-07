package com.example.bus.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Schedule::class], version = 1)
abstract class BusDatabase: RoomDatabase() {

    abstract fun scheduleDao(): ScheduleDao

    companion object {

        @Volatile
        private var INSTANCE: BusDatabase? = null
        fun getDatabase(context: Context): BusDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context,
                    BusDatabase::class.java,
                    "bus_database")
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}