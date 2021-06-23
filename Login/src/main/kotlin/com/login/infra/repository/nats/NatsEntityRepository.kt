package com.login.infra.repository.nats

import com.login.infra.entity.LoginEntity
import javax.inject.Singleton

@Singleton
interface NatsEntityRepository {
    fun addRegister(loginEntity: LoginEntity)
    fun addAddress(loginEntity: LoginEntity)
}