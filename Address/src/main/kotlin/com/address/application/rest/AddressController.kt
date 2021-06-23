package com.address.application.rest

import com.address.application.Exception.ErrorMessage
import com.address.application.dto.AddressDto
import com.address.core.mapper.AddressConverter
import com.address.core.port.AddressServicePort
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import java.util.*

@Controller("address")
class AddressController(private val addressServicePort: AddressServicePort) {

    @Get("/{id}")
    fun getId(@PathVariable id:UUID): HttpResponse<Any> {
        return if (addressServicePort.findByAddress(id) != null) {
            HttpResponse.ok(HttpStatus.OK).body(this.addressServicePort.findByAddress(id))
        } else {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
                .body(ErrorMessage("O Endereço do ID: $id não foi encontrado!"))
        }
    }

    @Post
    fun create(@Body addressDto: AddressDto): HttpResponse<Any> {
        return try {
            addressServicePort.createAddress(AddressConverter.addressDtoToAddress(addressDto))
            return HttpResponse.created(HttpStatus.CREATED).body(addressDto)
        } catch (e: Exception) {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
                .body(ErrorMessage("Os dados estão incorretos"))
        }
    }

    @Put("/{id}")
    fun update(@PathVariable id: UUID, @Body addressDto: AddressDto): HttpResponse<Any> {
        return if (addressServicePort.findByAddress(id) != null) {
            val agrupament = AddressDto(addressDto.id, addressDto.street, addressDto.number, addressDto.city, addressDto.state,
            addressDto.postalCode)
            HttpResponse.ok(HttpStatus.OK)
                .body(addressServicePort.addressUpdate(AddressConverter.addressDtoToAddress(agrupament)))
        } else {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
                .body(ErrorMessage("O Endereço do ID: $id não foi encontrado!"))
        }
    }

    @Delete("/{id}")
    fun delete(@PathVariable id: UUID): HttpResponse<Any> {
        return if (addressServicePort.findByAddress(id) != null) {
            HttpResponse.ok(HttpStatus.NO_CONTENT).body(this.addressServicePort.delete(id))
        } else {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
                .body(ErrorMessage("O Endereço do ID: $id não foi encontrado!"))
        }
    }
}


