package com.heiko.jetpacktestlogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.heiko.jetpacktestlogin.frame.compat.ImmersiveComapt

class MainActivity : AppCompatActivity() {
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mToolbar = findViewById(R.id.toolbar)
        ImmersiveComapt.immersive(this, mToolbar)
    }
}
