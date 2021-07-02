package com.login.infra.repository

import com.login.infra.entity.LoginEntity
import javax.inject.Singleton

@Singleton
interface NatsEntityRepository {
    fun addRegister(loginEntity: LoginEntity)
    fun uploadedRegister(loginEntity: LoginEntity)
    fun addAddress(loginEntity: LoginEntity)
    fun uploadedAddress(loginEntity: LoginEntity)
}