package com.login.core.service

import com.login.application.dto.LoginDto
import com.login.core.domain.Login
import com.login.core.mapper.LoginConverter
import com.login.core.port.LoginRepositoryPort
import com.login.core.port.LoginServicePort
import java.util.*
import javax.inject.Singleton

@Singleton
class LoginService(private val loginRepositoryPort: LoginRepositoryPort): LoginServicePort {
    override fun findById(id: UUID): LoginDto {
        val loginEntityResult = loginRepositoryPort.findLoginById(id)
        return LoginConverter.loginToLoginDto(loginEntityResult!!)
    }

}