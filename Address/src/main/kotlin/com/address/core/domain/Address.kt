package com.address.core.domain

import java.util.*

data class Address (
    val id: UUID? = null,
    val street: String = "",
    val number: Int = 0,
    val city: String = "",
    val state: String = "",
    val postalCode: String = "",
)