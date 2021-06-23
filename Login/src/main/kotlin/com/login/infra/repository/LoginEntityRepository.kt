package com.login.infra.repository

import com.login.core.domain.Login
import java.util.*
import javax.inject.Singleton

@Singleton
interface LoginEntityRepository {
    fun findAddressById(id: UUID): Login?

}