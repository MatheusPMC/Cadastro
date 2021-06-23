package com.address.infra.nats

import com.address.infra.entity.AddressEntity
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
interface AddressClient {
    @Subject("createAddress")
    fun saveAddress(addressEntity: AddressEntity)
    @Subject("updateAddress")
    fun updateAddress(addressEntity: AddressEntity)
}