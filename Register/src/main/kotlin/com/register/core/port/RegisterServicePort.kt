package com.register.core.port

import com.register.application.dto.RegisterDto
import com.register.core.domain.Register
import javax.inject.Singleton

@Singleton
interface RegisterServicePort {
    fun createRegister(register: Register) : RegisterDto
    fun registerUpdate(register: Register): RegisterDto
}