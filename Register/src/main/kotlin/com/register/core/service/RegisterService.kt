package com.register.core.service

import com.register.core.domain.Register
import com.register.core.mapper.RegisterConverter
import com.register.core.port.RegisterRepositoryPort
import com.register.core.port.RegisterServicePort
import javax.inject.Singleton

@Singleton
class RegisterService(private val registerRepository: RegisterRepositoryPort): RegisterServicePort {

    override fun createRegister(register: Register) =
        RegisterConverter.registerToRegisterDto(registerRepository.registerAdd(
            RegisterConverter.registerToRegisterEntity(register)))

    override fun registerUpdate(register: Register) =
        RegisterConverter.registerToRegisterDto(registerRepository.registerUpdate(
            RegisterConverter.registerToRegisterEntity(register)))

}