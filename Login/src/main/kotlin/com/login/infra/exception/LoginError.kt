package com.login.infra.exception

data class LoginError (
    val error: String = "",
    val code: Int = 0,
    val message: String = ""
)