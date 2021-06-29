package com.register.infra.repository.impl

import com.register.infra.entity.RegisterEntity
import com.register.infra.exception.RegisterExceptionImpl
import com.register.infra.nats.RegisterClient
import com.register.infra.repository.RegisterEntityRepository
import javax.inject.Singleton

@Singleton
class RegisterEntityRepositoryImpl(private val registerClient: RegisterClient): RegisterEntityRepository {

    override fun registerSave(registerEntity: RegisterEntity): RegisterEntity {
        if (registerEntity != null){
            registerClient.registerSave(registerEntity)
        } else {
            throw RegisterExceptionImpl()
        }
        return registerEntity
    }

    override fun registerUploaded(registerEntity: RegisterEntity): RegisterEntity {
        if (registerEntity != null){
            registerClient.registerUploaded(registerEntity)
        } else {
            throw RegisterExceptionImpl()
        }
        return registerEntity
    }
}