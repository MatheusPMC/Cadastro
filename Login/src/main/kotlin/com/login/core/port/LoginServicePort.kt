package com.login.core.port

import com.login.application.dto.LoginDto
import com.login.core.domain.Login
import java.util.*
import javax.inject.Singleton

@Singleton
interface LoginServicePort {
    fun findById(id: UUID): LoginDto?
}