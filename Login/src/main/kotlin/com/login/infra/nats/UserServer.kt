package com.login.infra.nats

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.login.infra.entity.LoginEntity
import com.login.infra.repository.NatsEntityRepository
import io.micronaut.nats.annotation.NatsListener
import io.micronaut.nats.annotation.Subject


@NatsListener
class UserServer(private val natsRepository: NatsEntityRepository) {
    private val mapper = jacksonObjectMapper()

    @Subject("createRegister")
    fun receiveAddRegister(loginEntity: LoginEntity) {
        val transformString = mapper.writeValueAsString(loginEntity)
        val transform = mapper.readValue<LoginEntity>(transformString)
        natsRepository.addRegister(transform)
    }

    @Subject("updateRegister")
    fun receiveUpRegister(loginEntity: LoginEntity) {
        val transformString = mapper.writeValueAsString(loginEntity)
        val transform = mapper.readValue<LoginEntity>(transformString)
        natsRepository.uploadedRegister(transform)
    }

    @Subject("createAddress")
    fun receiveAddAddress(loginEntity: LoginEntity) {
        val transformString = mapper.writeValueAsString(loginEntity)
        val transform = mapper.readValue<LoginEntity>(transformString)
        natsRepository.addAddress(transform)
    }

    @Subject("updateAddress")
    fun receiveUpAddress(loginEntity: LoginEntity) {
        val transformString = mapper.writeValueAsString(loginEntity)
        val transform = mapper.readValue<LoginEntity>(transformString)
        natsRepository.uploadedAddress(transform)
    }
}