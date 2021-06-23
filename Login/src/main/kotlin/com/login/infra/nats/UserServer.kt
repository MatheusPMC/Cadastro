package com.login.infra.nats

import com.login.infra.entity.AddressEntity
import com.login.infra.entity.RegisterEntity
import com.login.infra.service.nats.LoginEntityServiceNats
import io.micronaut.nats.annotation.NatsListener
import io.micronaut.nats.annotation.Subject


@NatsListener
class UserServer(private val loginService: LoginEntityServiceNats) {

    @Subject("createRegister")
    fun receive(registerEntity: RegisterEntity) {
        loginService.createRegister(registerEntity)
    }

    @Subject("createAddress")
    fun receive(addressEntity: AddressEntity) {
        loginService.createAddress(addressEntity)
    }
}