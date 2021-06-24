package com.register.infra.service

import com.register.core.domain.Register
import com.register.core.mapper.RegisterConverter
import com.register.core.port.RegisterRepositoryPort
import com.register.infra.entity.RegisterEntity
import com.register.infra.repository.RegisterEntityRepository
import javax.inject.Singleton

@Singleton
class RegisterEntityService(private val registerEntityRepository: RegisterEntityRepository) : RegisterRepositoryPort {

    override fun registerAdd(registerEntity: RegisterEntity): Register {
        val registerEntityResult = registerEntityRepository.registerSave(registerEntity)
        return RegisterConverter.registerEntityToRegister(registerEntityResult)
    }

    override fun registerUpdate(registerEntity: RegisterEntity): Register {
        val registerEntityResult = registerEntityRepository.registerUploaded(registerEntity)
        return RegisterConverter.registerEntityToRegister(registerEntityResult)
    }
}