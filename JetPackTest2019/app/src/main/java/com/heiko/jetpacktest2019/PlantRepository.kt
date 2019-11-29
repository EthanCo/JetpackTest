package com.heiko.jetpacktest2019

/**
 * PlantRepository
 *
 * @author Heiko
 * @date 2019/11/28
 */
class PlantRepository constructor(private val plantDao: PlantDao) {

    fun getPlants() = plantDao.getPlants()

    fun getPlant(plantId: String) = plantDao.getPlant(plantId)

    fun getPlantsWithGrowZoneNumber(growZoneNumber: Int) = plantDao.getPlantsWithGrowZoneNumber(growZoneNumber)

    companion object {
        // For Singleton instantiation
        @Volatile
        private var instance: PlantRepository? = null

        fun getInstance(plantDao: PlantDao) =
            instance ?: synchronized(this) {
                instance ?: PlantRepository(plantDao).also { instance = it }
            }
    }
}