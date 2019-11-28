package com.heiko.jetpacktest2019

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * Factory for creating a [PlantListViewModel] with a constructor that takes a [PlantRepository].
 *
 * @author Heiko
 * @date 2019/11/28
 */
class PlantListViewModelFactory(private val repository: PlantRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>) = PlantListViewModel(/*repository*/) as T
}