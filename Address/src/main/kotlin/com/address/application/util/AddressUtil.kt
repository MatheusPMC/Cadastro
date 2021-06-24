package com.address.application.util

import com.address.application.controller.handler.AddressException
import com.address.application.dto.AddressDto

class AddressUtil {
    companion object{
        fun isValid(addressDto: AddressDto): AddressDto {

            if (addressDto.id == null) {
                throw AddressException()
            }
            return addressDto
        }
    }
}