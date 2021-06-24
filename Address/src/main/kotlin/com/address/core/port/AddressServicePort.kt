package com.address.core.port

import com.address.application.dto.AddressDto
import com.address.core.domain.Address
import javax.inject.Singleton

@Singleton
interface AddressServicePort {
    fun addressAdd(address: Address) : AddressDto
    fun addressUpdate(address: Address): AddressDto
}