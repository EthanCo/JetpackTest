package com.heiko.jetpacktest2019

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.observe
import com.heiko.jetpacktest2019.databinding.FragmentPlantListBinding

/**
 * 植物列表
 *
 * @author Heiko
 * @date 2019/11/26
 */
class PlantListFragment : Fragment() {
    /*private val viewModel : PlantListViewModel by viewModels {
        InjectorUtils.providePlantListViewModelFactory(requireContext())
    }*/
    private var viewModel : PlantListViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = InjectorUtils.providePlantListViewModelFactory(
            activity as FragmentActivity
        )

        val binding = FragmentPlantListBinding.inflate(inflater, container, false)
        context ?: return binding.root

        val adapter = PlantAdapter()
        binding.plantList.adapter = adapter
        subscribeUi(adapter)

        //setHasOptionsMenu(true)
        return binding.root
    }

    private fun subscribeUi(adapter: PlantAdapter) {
        viewModel?.plants?.observe(viewLifecycleOwner) { plants ->
            adapter.submitList(plants)
        }
    }
}