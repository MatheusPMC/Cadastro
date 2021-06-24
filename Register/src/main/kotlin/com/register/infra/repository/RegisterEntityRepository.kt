package com.register.infra.repository

import com.register.infra.entity.RegisterEntity
import javax.inject.Singleton

@Singleton
interface RegisterEntityRepository {
    fun registerSave(registerEntity: RegisterEntity): RegisterEntity
    fun registerUploaded(registerEntity: RegisterEntity): RegisterEntity
}