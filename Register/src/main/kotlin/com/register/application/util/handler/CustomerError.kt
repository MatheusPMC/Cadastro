package com.register.application.util.handler

data class CustomerError(
    val error: String = "",
    val code: Int = 0,
    val message: String = ""
)