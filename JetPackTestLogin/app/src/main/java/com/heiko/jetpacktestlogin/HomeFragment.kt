package com.heiko.jetpacktestlogin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.heiko.jetpacktestlogin.frame.compat.ImmersiveComapt


class HomeFragment : Fragment() {
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.home_fragment, container, false)
        //setHasOptionsMenu(true)
        val toolbar = root.findViewById<Toolbar>(R.id.toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_apps_black_24dp)
        val compatActivity = activity as AppCompatActivity
        compatActivity.setSupportActionBar(toolbar)
        compatActivity.title = ""
        ImmersiveComapt.immersive(activity,toolbar)
        val supportActionBar = compatActivity.supportActionBar
//        supportActionBar?.setDisplayHomeAsUpEnabled(true);//左侧添加一个默认的返回图标
//        supportActionBar?.setHomeButtonEnabled(true); //设置返回键可用
        /*toolbar.setNavigationOnClickListener { view ->
            Toast.makeText(activity, "返回", Toast.LENGTH_SHORT).show()
        }*/
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
    }

}
