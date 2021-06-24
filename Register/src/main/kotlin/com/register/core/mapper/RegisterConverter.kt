package com.register.core.mapper

import com.register.application.dto.RegisterDto
import com.register.core.domain.Register
import com.register.infra.entity.RegisterEntity

class RegisterConverter {
    companion object {

        fun registerDtoToRegister(registerDto: RegisterDto) =
            Register(
                registerDto.id,registerDto.name,registerDto.age,registerDto.cpf,registerDto.email,registerDto.phone)

        fun registerToRegisterDto(register: Register) =
            RegisterDto(register.id,register.name,register.age,register.cpf,register.email,register.phone)

        fun registerToRegisterEntity(register: Register) =
            RegisterEntity(register.id,register.name,register.age,register.cpf,register.email,register.phone)

        fun registerEntityToRegister(registerEntity: RegisterEntity) =
            Register(registerEntity.id,registerEntity.name,registerEntity.age,registerEntity.cpf,registerEntity.email,
                registerEntity.phone)
    }
}