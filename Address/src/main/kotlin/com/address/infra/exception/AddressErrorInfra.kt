package com.address.infra.exception

data class AddressErrorInfra (
    val error: String = "",
    val code: Int = 0,
    val message: String = ""
)