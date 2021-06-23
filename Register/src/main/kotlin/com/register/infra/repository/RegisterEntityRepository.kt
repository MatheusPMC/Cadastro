package com.register.infra.repository

import com.register.infra.entity.RegisterEntity
import javax.inject.Singleton

@Singleton
interface RegisterEntityRepository {
    fun findAddressByCpf(cpf: String): com.register.core.domain.Register?
    fun findAllAddress(): List<RegisterEntity>
    fun registerSave(registerEntity: RegisterEntity): RegisterEntity
    fun registerUploaded(registerEntity: RegisterEntity): RegisterEntity
    fun deleteCql(cpf: String)
}