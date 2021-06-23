package com.register.core.domain

import java.util.*

data class Register(
    val id: UUID? = null,
    val name: String = "",
    val age: Number = 0,
    val cpf: String = "",
    val email: String = "",
    val phone: String = ""
)