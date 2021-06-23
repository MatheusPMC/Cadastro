package com.register.core.port

import com.register.core.domain.Register
import com.register.infra.entity.RegisterEntity
import javax.inject.Singleton

@Singleton
interface RegisterRepositoryPort {
    fun findRegisterByCpf(cpf: String): Register?
    fun findAllRegister(): List<RegisterEntity>
    fun registerAdd(registerEntity: RegisterEntity) : Register
    fun registerUpdate(registerEntity: RegisterEntity): Register
    fun delete(cpf: String)
}