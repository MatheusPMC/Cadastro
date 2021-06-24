package com.address.core.service

import com.address.application.dto.AddressDto
import com.address.core.domain.Address
import com.address.core.mapper.AddressConverter
import com.address.core.port.AddressRepositoryPort
import com.address.core.port.AddressServicePort
import javax.inject.Singleton

@Singleton
class AddressService(private val addressRepository: AddressRepositoryPort): AddressServicePort {

    override fun addressAdd(address: Address): AddressDto =
        AddressConverter.addressToAddressDto(addressRepository.addressAdd(
            AddressConverter.addressToAddressEntity(address)))

    override fun addressUpdate(address: Address): AddressDto =
        AddressConverter.addressToAddressDto(addressRepository.addressUpdate(
            AddressConverter.addressToAddressEntity(address)))


}