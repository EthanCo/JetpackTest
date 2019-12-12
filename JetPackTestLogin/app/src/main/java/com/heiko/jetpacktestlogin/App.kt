package com.heiko.jetpacktestlogin

import android.app.Application
import android.content.Context
import com.heiko.jetpacktestlogin.frame.kotlinex.KotlinGlobal

/**
 * App
 *
 * @author Heiko
 * @date 2019/12/12
 */
class App : Application() {
    companion object {
        lateinit var INSTANCE: Context
    }

    override fun onCreate() {
        super.onCreate()

        INSTANCE = this
        KotlinGlobal.init(this)
    }
}