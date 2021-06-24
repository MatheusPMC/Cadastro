package com.address.application.controller.handler

data class AddressError (
    val error: String = "",
    val code: Int = 0,
    val message: String = ""
)