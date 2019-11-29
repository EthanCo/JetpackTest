package com.heiko.jetpacktest2019

import android.content.Context


/**
 * TODO
 *
 * @author Heiko
 * @date 2019/11/28
 */
object InjectorUtils {
    private fun getPlantRepository(context: Context): PlantRepository {
        return PlantRepository.getInstance(
            AppDatabase.getInstance(context.applicationContext).plantDao()
        )
    }

    /*fun provideGardenPlantingListViewModelFactory(context: Context) : GardenPlanting{

    }*/

    fun providePlantListViewModelFactory(context: Context): PlantListViewModelFactory {
        val repository = getPlantRepository(context)
        return PlantListViewModelFactory(repository)
        //return ViewModelProviders.of(activity).get(PlantListViewModel::class.java)
    }

    fun providePlantDetailViewModelFactory(
        context: Context,
        plantId: String
    ): PlantDetailViewModelFactory {
        return PlantDetailViewModelFactory(
            getPlantRepository(context),
            getGardenPlantingRepository(context), plantId
        )
    }

    private fun getGardenPlantingRepository(context: Context): GardenPlantingRepository {
        return GardenPlantingRepository.getInstance(
            AppDatabase.getInstance(context.applicationContext).gardenPlantingDao())
    }
}