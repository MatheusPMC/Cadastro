package com.address.infra.repository

import com.address.core.domain.Address
import com.address.infra.entity.AddressEntity
import java.util.*
import javax.inject.Singleton

@Singleton
interface AddressEntityRepository {
    fun findAddressById(id: UUID): Address?
    fun saveAddress(addressEntity: AddressEntity): AddressEntity
    fun uploadedAddress(addressEntity: AddressEntity): AddressEntity
    fun deleteCql(id: UUID)
}