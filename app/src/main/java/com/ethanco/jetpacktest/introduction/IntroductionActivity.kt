package com.ethanco.jetpacktest.introduction

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ethanco.jetpacktest.R
import com.ethanco.jetpacktest.introduction.ui.introduction.IntroductionFragment

class IntroductionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.introduction_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, IntroductionFragment.newInstance())
                .commitNow()
        }
    }

}
