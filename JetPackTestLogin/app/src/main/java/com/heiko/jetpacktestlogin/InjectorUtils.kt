package com.heiko.jetpacktestlogin

import android.content.Context

/**
 * InjectorUtils
 *
 * @author Heiko
 * @date 2019/12/12
 */
object InjectorUtils {
    fun provideLoginViewModelFactory(
        context: Context
    ): LoginViewModelFactory {
        val repository = getLoginRepository()
        return LoginViewModelFactory(repository)
    }

    private fun getLoginRepository(): LoginRepository {
        return LoginRepository()
    }
}