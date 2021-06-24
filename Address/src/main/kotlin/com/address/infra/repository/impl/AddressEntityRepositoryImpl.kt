package com.address.infra.repository.impl

import com.address.infra.entity.AddressEntity
import com.address.infra.exception.AddressAlreadyExistsException
import com.address.infra.nats.AddressClient
import com.address.infra.repository.AddressEntityRepository
import javax.inject.Singleton

@Singleton
class AddressEntityRepositoryImpl(private val addressClient: AddressClient): AddressEntityRepository {

    override fun addressSave(addressEntity: AddressEntity): AddressEntity {
        if (addressEntity != null){
            addressClient.addressSave(addressEntity)
        } else {
            throw AddressAlreadyExistsException()
        }
        return addressEntity
    }

    override fun addressUploaded(addressEntity: AddressEntity): AddressEntity {
        if (addressEntity != null){
            addressClient.addressUpdate(addressEntity)
        } else {
            throw AddressAlreadyExistsException()
        }
        return addressEntity
    }
}