package com.heiko.jetpacktest2019

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

const val MY_GARDEN_PAGE_INDEX = 0
const val PLANT_LIST_PAGE_INDEX = 1

class SunflowerPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return  tabFragmentsCreators.size
    }

    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }

    private val tabFragmentsCreators : Map<Int,()->Fragment> = mapOf(
        MY_GARDEN_PAGE_INDEX to {GardenFragment()},
        PLANT_LIST_PAGE_INDEX to {PlantListFragment()}
    )
}
