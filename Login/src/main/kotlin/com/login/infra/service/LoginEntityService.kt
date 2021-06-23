package com.login.infra.service

import com.login.core.domain.Login
import com.login.core.port.LoginRepositoryPort
import com.login.infra.repository.LoginEntityRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class LoginEntityService(private val loginEntityRepository: LoginEntityRepository): LoginRepositoryPort {
    override fun findLoginById(id: UUID): Login? =
        loginEntityRepository.findAddressById(id)
}