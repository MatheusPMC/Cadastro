package com.login.infra.entity

import java.util.*

data class AddressEntity (
    val id: UUID? = null,
    val street: String = "",
    val number: Int = 0,
    val city: String = "",
    val state: String = "",
    val postalCode: String = "",
)