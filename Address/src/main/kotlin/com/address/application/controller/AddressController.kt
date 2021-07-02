package com.address.application.controller

import com.address.application.dto.AddressDto
import com.address.application.util.AddressUtil
import com.address.core.mapper.AddressConverter
import com.address.core.port.AddressServicePort
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import java.util.*
import javax.validation.Valid

@Validated
@Controller("address")
class AddressController(private val addressServicePort: AddressServicePort) {

    @Post
    fun create(@Body @Valid addressDto: AddressDto): HttpResponse<Any> {
        AddressUtil.isValid(addressDto)
        val addressDto = addressServicePort.addressAdd(AddressConverter.addressDtoToAddress(addressDto))
        return HttpResponse.created(HttpStatus.CREATED).body(addressDto)
    }

    @Put("/{id}")
    fun update(@PathVariable id: UUID, @Body @Valid addressDto: AddressDto): HttpResponse<Any> {
        val addressDto = AddressDto(
            id, addressDto.street, addressDto.number, addressDto.city, addressDto.state, addressDto.postalCode)
        AddressUtil.isValid(addressDto)
        return HttpResponse.ok(HttpStatus.OK)
            .body(addressServicePort.addressUpdate(AddressConverter.addressDtoToAddress(addressDto)))
    }
}


