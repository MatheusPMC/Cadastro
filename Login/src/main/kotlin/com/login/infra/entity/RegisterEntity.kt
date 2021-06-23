package com.login.infra.entity

import java.util.*

data class RegisterEntity(
    val id: UUID? = null,
    val name: String = "",
    val age: Int = 0,
    val cpf: String = "",
    val email: String = "",
    val phone: String = ""
)