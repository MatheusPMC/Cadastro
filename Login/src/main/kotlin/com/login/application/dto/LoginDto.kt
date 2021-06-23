package com.login.application.dto

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class LoginDto (
    val id: UUID? = null,
    val name: String = "",
    val age: Number = 0,
    val cpf: String = "",
    val email: String = "",
    val phone: String = "",
    val street: String = "",
    val number: Int = 0,
    val city: String = "",
    val state: String = "",
    val postalCode: String = "",
)