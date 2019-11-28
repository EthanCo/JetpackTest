package com.heiko.jetpacktest2019

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap

/**
 * TODO
 *
 * @author Heiko
 * @date 2019/11/28
 */
class PlantListViewModel internal constructor(/*plantRepository: PlantRepository*/) : ViewModel() {
    private val growZoneNumber = MutableLiveData<Int>(NO_GROW_ZONE)
    private val plantRepository = PlantRepository()

    val plants: LiveData<ArrayList<Plant>> = growZoneNumber.switchMap {
        /*if (it == NO_GROW_ZONE) {
            plantRepository.getPlants()
        } else {
            plantRepository.getPlantsWithGrowZoneNumber(it)
        }*/
        val arrayList = ArrayList<Plant>()
        arrayList.add(Plant("1","西瓜","这是一个西瓜",1,7,"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1574915662876&di=bb7b0d53714b5e8dafb3ce73da56e5e8&imgtype=0&src=http%3A%2F%2Fimgqn.koudaitong.com%2Fupload_files%2F2015%2F07%2F01%2FFs4Kq6bMkEyXy9MG0e627dJp_kpS.jpg%2521280x280.jpg"))
        arrayList.add(Plant("2","猕猴桃","这是一个猕猴桃",2,7,"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1574915877254&di=8ddd902d0b71be41fcf2de4dcff4bef1&imgtype=0&src=http%3A%2F%2Fwww.mlxhzs.com%2FPhoto%2Fx11%2F2.jpg"))
        MutableLiveData(arrayList)
    }

    fun setGrowZoneNumber(num: Int) {
        growZoneNumber.value = num
    }

    fun clearGrowZoneNumber() {
        growZoneNumber.value = NO_GROW_ZONE
    }

    companion object {
        private const val NO_GROW_ZONE = -1
    }
}