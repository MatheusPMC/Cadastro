package com.address.application.postalCode

import com.address.application.dto.CepDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

@Client("https://viacep.com.br/ws")
interface AddressClient {
    fun consulta(@PathVariable cep: String): HttpResponse<CepDto>
}