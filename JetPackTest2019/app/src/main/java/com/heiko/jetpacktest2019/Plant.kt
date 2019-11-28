package com.heiko.jetpacktest2019

/**
 * TODO
 *
 * @author Heiko
 * @date 2019/11/28
 */
data class Plant(
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