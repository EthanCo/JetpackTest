package com.heiko.jetpacktestlogin

import com.heiko.jetpacktestlogin.data.UserInfo

/**
 * LoginRepository
 *
 * @author Heiko
 * @date 2019/12/12
 */
class LoginRepository {
    fun login(userName: String, password: String): UserInfo? {
        if ("admin" == userName && "123456" == password) {
            return UserInfo("admin",20)
        }
        return null
    }
}