package com.address.infra.service

import com.address.core.domain.Address
import com.address.core.mapper.AddressConverter
import com.address.core.port.AddressRepositoryPort
import com.address.infra.entity.AddressEntity
import com.address.infra.repository.AddressEntityRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class AddressEntityService(private val addressEntityRepository: AddressEntityRepository) : AddressRepositoryPort {
    override fun findAddressById(id: UUID): Address? =
        addressEntityRepository.findAddressById(id)

    override fun addAddress(addressEntity: AddressEntity): Address {
        val addressEntityResult = addressEntityRepository.saveAddress(addressEntity)
        return AddressConverter.addressEntityToAddress(addressEntityResult)
    }

    override fun addressUpdate(addressEntity: AddressEntity): Address {
        val addressEntityResult = addressEntityRepository.uploadedAddress(addressEntity)
        return AddressConverter.addressEntityToAddress(addressEntityResult)
    }

    override fun delete(id: UUID) {
        addressEntityRepository.deleteCql(id)
    }
}