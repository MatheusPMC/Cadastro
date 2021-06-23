package com.address.core.port

import com.address.core.domain.Address
import com.address.infra.entity.AddressEntity
import java.util.*
import javax.inject.Singleton

@Singleton
interface AddressRepositoryPort {
    fun findAddressById(id: UUID): Address?
    fun addAddress(addressEntity: AddressEntity) : Address
    fun addressUpdate(addressEntity: AddressEntity): Address
    fun delete(id: UUID)
}