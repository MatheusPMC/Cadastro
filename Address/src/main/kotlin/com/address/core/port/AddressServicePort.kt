package com.address.core.port

import com.address.application.dto.AddressDto
import com.address.core.domain.Address
import java.util.*
import javax.inject.Singleton

@Singleton
interface AddressServicePort {
    fun findByAddress(id: UUID): Address?
    fun createAddress(address: Address) : AddressDto
    fun addressUpdate(address: Address): AddressDto
    fun delete(id: UUID)
}