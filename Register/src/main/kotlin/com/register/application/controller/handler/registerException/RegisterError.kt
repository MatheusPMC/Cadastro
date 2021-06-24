package com.register.application.controller.handler.registerException

data class RegisterError (
    val error: String = "",
    val code: Int = 0,
    val message: String = ""
)