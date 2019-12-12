package com.heiko.jetpacktestlogin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * LoginRepositoryFactory
 *
 * @author Heiko
 * @date 2019/12/12
 */
class LoginViewModelFactory(private val repository: LoginRepository) :
    ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginViewModel(repository) as T
    }
}