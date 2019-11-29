package com.heiko.jetpacktest2019

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 植物
 *
 * @author Heiko
 * @date 2019/11/28
 */
@Entity(tableName = "plants")
data class Plant(
    @PrimaryKey @ColumnInfo(name = "id")
    val plantId: String,
    val name: String,
    val description: String,
    val growZoneNumber: Int,
    val wateringInterval: Int = 7, // how often the plant should be watered, in days
    val imageUrl: String = ""
) {

    override fun toString(): String {
        return name
    }
}