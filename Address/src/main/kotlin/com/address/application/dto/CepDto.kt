package com.address.application.dto

data class CepDto(
    val logradouro: String,
    val localidade: String,
    val uf: String,
    val cep: String
)