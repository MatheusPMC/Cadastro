package com.address.core.service

import com.address.application.dto.AddressDto
import com.address.core.domain.Address
import com.address.core.mapper.AddressConverter
import com.address.core.port.AddressRepositoryPort
import com.address.core.port.AddressServicePort
import com.address.infra.nats.AddressClient
import java.util.*
import javax.inject.Singleton

@Singleton
class AddressService(private val addressRepository: AddressRepositoryPort, private val addressClient: AddressClient): AddressServicePort {
    override fun findByAddress(id: UUID): Address? =
        addressRepository.findAddressById(id)

    override fun createAddress(address: Address): AddressDto =
        AddressConverter.addressToAddressDto(addressRepository.addAddress(AddressConverter.addressToAddressEntity(address)))

    override fun addressUpdate(address: Address): AddressDto =
        AddressConverter.addressToAddressDto(addressRepository.addressUpdate(AddressConverter.addressToAddressEntity(address)))

    override fun delete(id: UUID) =
        addressRepository.delete(id)

}