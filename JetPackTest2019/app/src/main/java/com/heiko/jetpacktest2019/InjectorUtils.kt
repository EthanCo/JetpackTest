package com.heiko.jetpacktest2019

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders




/**
 * TODO
 *
 * @author Heiko
 * @date 2019/11/28
 */
object InjectorUtils {
    fun providePlantListViewModelFactory(activity: FragmentActivity): PlantListViewModel {
        /*val repository = getPlantRepository(context)
        return PlantListViewModelFactory(repository)*/
        return ViewModelProviders.of(activity).get(PlantListViewModel::class.java)
    }

    /*private fun getPlantRepository(context: Context): PlantRepository {
        return PlantRepository.getInstance(
            AppDatabase.getInstance(context.applicationContext).plantDao())
    }*/
}