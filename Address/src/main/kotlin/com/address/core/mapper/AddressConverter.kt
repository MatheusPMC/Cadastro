package com.address.core.mapper

import com.address.application.dto.AddressDto
import com.address.core.domain.Address
import com.address.infra.entity.AddressEntity

class AddressConverter {
    companion object {
        fun addressDtoToAddress(addressDto: AddressDto) =
            Address(addressDto.id,addressDto.street,addressDto.number,addressDto.city,addressDto.state,addressDto.postalCode)

        fun addressToAddressEntity(address: Address) =
            AddressEntity(address.id,address.street,address.number,address.city,address.state,address.postalCode)

        fun addressEntityToAddress(addressEntity: AddressEntity) =
            Address(addressEntity.id,addressEntity.street,addressEntity.number,addressEntity.city,addressEntity.state,addressEntity.postalCode)

        fun addressToAddressDto(address: Address)=
            AddressDto(address.id,address.street,address.number,address.city,address.state,address.postalCode)
    }
}