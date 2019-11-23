package com.heiko.jetpacktest2019

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.heiko.jetpacktest2019.databinding.FragmentPlantDetailBinding

/**
 * PlantDetailFragment
 *
 * @author Heiko
 * @date 2019/11/23
 */
class PlantDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentPlantDetailBinding>(
            inflater,
            R.layout.fragment_plant_detail,
            container,
            false
        )

        return binding.root
    }

}