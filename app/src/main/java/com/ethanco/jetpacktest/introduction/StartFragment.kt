package com.ethanco.jetpacktest.introduction

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ethanco.jetpacktest.R
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment() {

    companion object {
        fun newInstance() = StartFragment()
    }

    private lateinit var viewModel: StartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btn_next_fragment.setOnClickListener {
            Navigation.findNavController(view!!).navigate(R.id.action_nav_first_frag_to_nav_second_frag)
        }

        viewModel = ViewModelProviders.of(this).get(StartViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
