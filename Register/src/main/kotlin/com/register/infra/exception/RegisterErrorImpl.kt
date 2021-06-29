package com.register.infra.exception

data class RegisterErrorImpl (
    val error: String = "",
    val code: Int = 0,
    val message: String = ""
)