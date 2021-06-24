package com.register.application.dto

import io.micronaut.core.annotation.Introspected
import io.micronaut.messaging.annotation.MessageBody
import io.micronaut.messaging.annotation.MessageProducer
import java.util.*
import javax.validation.constraints.*

@Introspected
data class RegisterDto(
    var id: UUID? = null,
    @field:[NotBlank(message = "Campo obrigatório") Size(max = 255)] val name: String = "",
    @field:[Positive(message = "Campo obrigatório")] val age: Number = 0,
    @field:[NotBlank(message = "Campo obrigatório") Size(max = 14)] val cpf: String = "",
    @field:[NotBlank(message = "Campo obrigatório") Email Size(max = 255)] val email: String = "",
    @field:[NotBlank(message = "Campo obrigatório") Size (min = 11, max = 14)] val phone: String = ""
)