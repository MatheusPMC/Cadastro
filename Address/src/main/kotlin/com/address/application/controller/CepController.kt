package com.address.application.controller

import com.address.application.postalCode.AddressClient
import com.address.application.postalCode.CepConverter
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.validation.Validated

@Validated
@Controller("cep")
class CepController( private val addressClient: AddressClient) {

    @Get("/{cep}")
    fun getCep(@PathVariable cep: String) : HttpResponse<Any> {
        return  try {
            val consulta = addressClient.consulta(cep).body()
            HttpResponse.ok(HttpStatus.OK).body(CepConverter.cepDtoToAddressDto(consulta!!))
        } catch (e: Exception) {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
        }
    }
}