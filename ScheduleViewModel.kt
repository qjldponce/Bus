package com.example.bus.model

import androidx.lifecycle.ViewModel
import com.example.bus.database.Schedule
import com.example.bus.database.ScheduleDao
import kotlinx.coroutines.flow.Flow

class ScheduleViewModel (private val scheduleDao: ScheduleDao): ViewModel() {

    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()

    fun scheduleForStopName(name: String): Flow<List<Schedule>> = scheduleDao.getByStopName(name)
}