package com.login.infra.service.nats

import com.login.infra.entity.AddressEntity
import com.login.infra.entity.AddressEntityUp
import com.login.infra.entity.RegisterEntity
import com.login.infra.entity.RegisterEntityUp
import javax.inject.Singleton

@Singleton
interface LoginEntityServiceNats {
    fun createRegister(registerEntity: RegisterEntity)
    fun uploadedRegister(registerEntityUp: RegisterEntityUp)
    fun createAddress(addressEntity: AddressEntity)
    fun uploadedAddress(addressEntityUp: AddressEntityUp)
}