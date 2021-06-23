package com.login.core.domain

import java.util.*

data class Login(
    val id: UUID? = null,
    val name: String = "",
    val age: Number? = 0,
    val cpf: String = "",
    val email: String = "",
    val phone: String = "",
    val street: String = "",
    val number: Int? = 0,
    val city: String = "",
    val state: String = "",
    val postalCode: String = "",
)