package com.address.infra.service

import com.address.core.domain.Address
import com.address.core.mapper.AddressConverter
import com.address.core.port.AddressRepositoryPort
import com.address.infra.entity.AddressEntity
import com.address.infra.repository.AddressEntityRepository
import javax.inject.Singleton

@Singleton
class AddressEntityService(private val addressEntityRepository: AddressEntityRepository) : AddressRepositoryPort {
    override fun addressAdd(addressEntity: AddressEntity): Address {
        val addressEntityResult = addressEntityRepository.addressSave(addressEntity)
        return AddressConverter.addressEntityToAddress(addressEntityResult)
    }

    override fun addressUpdate(addressEntity: AddressEntity): Address {
        val addressEntityResult = addressEntityRepository.addressUploaded(addressEntity)
        return AddressConverter.addressEntityToAddress(addressEntityResult)
    }

}