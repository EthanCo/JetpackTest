package com.heiko.jetpacktest2019

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * 用于创建[PlantDetailViewModel]的工厂，其构造函数接受[PlantRepository]和当前[Plant]的ID。
 *
 * @author Heiko
 * @date 2019/11/29
 */
class PlantDetailViewModelFactory(
    private val plantRepository: PlantRepository,
    private val gardenPlantingRepository: GardenPlantingRepository,
    private val plantId: String
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PlantDetailViewModel(plantRepository, gardenPlantingRepository, plantId) as T
    }
}