package com.address.infra.repository

import com.address.infra.entity.AddressEntity
import javax.inject.Singleton

@Singleton
interface AddressEntityRepository {
    fun addressSave(addressEntity: AddressEntity): AddressEntity
    fun addressUploaded(addressEntity: AddressEntity): AddressEntity
}