package com.heiko.jetpacktest2019

import androidx.room.TypeConverter
import java.util.*

/**
 * Converters
 *
 * @author Heiko
 * @date 2019/11/29
 */
class Converters {
    @TypeConverter
    fun calendarToDatestamp(calendar: Calendar): Long = calendar.timeInMillis

    @TypeConverter
    fun datestampToCalendar(value: Long): Calendar =
        Calendar.getInstance().apply { timeInMillis = value }
}