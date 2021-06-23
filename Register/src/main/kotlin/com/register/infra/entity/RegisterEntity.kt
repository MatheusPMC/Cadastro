package com.register.infra.entity

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class RegisterEntity(
    val id: UUID? = null,
    val name: String = "",
    val age: Number = 0,
    val cpf: String = "",
    val email: String = "",
    val phone: String = ""
)