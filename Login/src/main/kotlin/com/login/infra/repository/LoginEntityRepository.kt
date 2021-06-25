package com.login.infra.repository

import com.login.infra.entity.LoginEntity
import java.util.*
import javax.inject.Singleton

@Singleton
interface LoginEntityRepository {
    fun findAddressById(id: UUID): LoginEntity?
}