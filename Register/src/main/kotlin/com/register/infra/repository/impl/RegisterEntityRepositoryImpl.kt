package com.register.infra.repository.impl

import com.register.infra.entity.RegisterEntity
import com.register.application.controller.handler.registerException.RegisterException
import com.register.infra.exception.RegisterAlreadyExistsException
import com.register.infra.nats.RegisterClient
import com.register.infra.repository.RegisterEntityRepository
import javax.inject.Singleton

@Singleton
class RegisterEntityRepositoryImpl(private val registerClient: RegisterClient): RegisterEntityRepository {

    override fun registerSave(registerEntity: RegisterEntity): RegisterEntity {
        if (registerEntity != null){
            registerClient.registerSave(registerEntity)
        } else {
            throw RegisterAlreadyExistsException()
        }
        return registerEntity
    }

    override fun registerUploaded(registerEntity: RegisterEntity): RegisterEntity {
        if (registerEntity != null){
            registerClient.registerUploaded(registerEntity)
        } else {
            throw RegisterAlreadyExistsException()
        }
        return registerEntity
    }
}