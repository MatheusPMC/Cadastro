package com.login.infra.service.nats

import com.login.infra.entity.AddressEntity
import com.login.infra.entity.RegisterEntity
import javax.inject.Singleton

@Singleton
interface LoginEntityServiceNats {
    fun createRegister(registerEntity: RegisterEntity)
    fun createAddress(addressEntity: AddressEntity)
}