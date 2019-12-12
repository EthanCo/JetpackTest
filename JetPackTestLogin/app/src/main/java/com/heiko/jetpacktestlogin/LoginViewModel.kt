package com.heiko.jetpacktestlogin

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heiko.jetpacktestlogin.data.UserInfo
import com.heiko.jetpacktestlogin.frame.kotlinex.getString

class LoginViewModel internal constructor(private val loginRepository: LoginRepository) : ViewModel() {
    //private val loginRepository = LoginRepository()

    val toastLiveData = MutableLiveData<String>()
    val loginSuccessLiveData = MutableLiveData<UserInfo>()
    val loadingDialogLiveData = MutableLiveData<Boolean>()

    fun login(userName: String, password: String) {
        if (userName.isEmpty() || password.isEmpty()) {
            val info = getString(R.string.username_or_password_not_empty)
            toastLiveData.postValue(info)
            return
        }

        loadingDialogLiveData.postValue(true)
        Handler().postDelayed({
            val userInfo = loginRepository.login(userName, password)
            if (userInfo == null) {
                loadingDialogLiveData.postValue(false)
                toastLiveData.postValue(getString(R.string.login_failed))
            } else {
                loadingDialogLiveData.postValue(false)
                loginSuccessLiveData.postValue(userInfo)
            }
        }, 2000)
    }
}
