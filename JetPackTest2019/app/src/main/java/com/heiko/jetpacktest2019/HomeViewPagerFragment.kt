package com.heiko.jetpacktest2019

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.heiko.jetpacktest2019.databinding.FragmentViewPagerBinding

/**
 * HomeViewPagerFragment
 *
 * @author Heiko
 * @date 2019/11/23
 */
class HomeViewPagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        binding.tv01.setOnClickListener {
            HomeViewPagerFragmentDirections.actionViewPagerFragmentToPlantDetailFragment("1")
        }

        return binding.root
    }
}