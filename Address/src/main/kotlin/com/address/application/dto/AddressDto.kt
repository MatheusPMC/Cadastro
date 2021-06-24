package com.address.application.dto

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class AddressDto(
    val id: UUID? = null,
    val street: String = "",
    val number: Int = 0,
    val city: String = "",
    val state: String = "",
    val postalCode: String = ""
)