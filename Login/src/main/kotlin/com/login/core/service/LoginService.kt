package com.login.core.service

import com.login.core.domain.Login
import com.login.core.port.LoginRepositoryPort
import com.login.core.port.LoginServicePort
import java.util.*
import javax.inject.Singleton

@Singleton
class LoginService(private val loginRepositoryPort: LoginRepositoryPort): LoginServicePort {
    override fun findById(id: UUID): Login? =
        loginRepositoryPort.findLoginById(id)
}