package com.address.core.port

import com.address.core.domain.Address
import com.address.infra.entity.AddressEntity
import javax.inject.Singleton

@Singleton
interface AddressRepositoryPort {
    fun addressAdd(addressEntity: AddressEntity) : Address
    fun addressUpdate(addressEntity: AddressEntity): Address
}