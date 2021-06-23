package com.register.infra.nats

import com.register.infra.entity.RegisterEntity
import io.micronaut.nats.annotation.NatsClient
import io.micronaut.nats.annotation.Subject

@NatsClient
interface RegisterClient {
    @Subject("createRegister")
    fun registerSave(registerEntity: RegisterEntity)
    @Subject("updateRegister")
    fun registerUploaded(registerEntity: RegisterEntity)
}