package com.register.core.service

import com.register.core.domain.Register
import com.register.core.mapper.RegisterConverter
import com.register.core.port.RegisterRepositoryPort
import com.register.core.port.RegisterServicePort
import com.register.infra.nats.RegisterClient
import javax.inject.Singleton

@Singleton
class RegisterService(private val registerRepository: RegisterRepositoryPort, private val registerClient: RegisterClient): RegisterServicePort {

    override fun findByCpf(cpf: String): Register? =
        registerRepository.findRegisterByCpf(cpf)

    override fun findRegistersList(): List<Register> =
        RegisterConverter.registerEntityToRegisterList(registerRepository.findAllRegister())

    override fun createRegister(register: Register) =
        RegisterConverter.registerToRegisterDto(registerRepository.registerAdd(
            RegisterConverter.registerToRegisterEntity(register)))

    override fun registerUpdate(register: Register) =
        RegisterConverter.registerToRegisterDto(registerRepository.registerUpdate(
            RegisterConverter.registerToRegisterEntity(register)))

    override fun delete(cpf: String) =
        registerRepository.delete(cpf)
}