package com.ethanco.jetpacktest.introduction

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ethanco.jetpacktest.R

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.introduction_activity)
        /*if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, StartFragment.newInstance())
                .commitNow()
        }*/
    }

}
