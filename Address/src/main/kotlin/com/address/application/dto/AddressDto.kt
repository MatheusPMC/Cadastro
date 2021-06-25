package com.address.application.dto

import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Positive
import javax.validation.constraints.Size

@Introspected
data class AddressDto(
    val id: UUID? = null,
    @field:[NotBlank(message = "Campo obrigatório") Size(max = 255)] val street: String = "",
    @field:[Positive(message = "Campo obrigatório")] val number: Int = 0,
    @field:[NotBlank(message = "Campo obrigatório") Size(max = 25)] val city: String = "",
    @field:[NotBlank(message = "Campo obrigatório") Size(max = 25)] val state: String = "",
    @field:[NotBlank(message = "Campo obrigatório") Size(min = 8, max = 9)] val postalCode: String = ""
)