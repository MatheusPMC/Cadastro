package com.register.application.controller.handler.cpfException

data class CustomerError(
    val error: String = "",
    val code: Int = 0,
    val message: String = ""
)