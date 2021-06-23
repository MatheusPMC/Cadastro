package com.login.core.port

import com.login.core.domain.Login
import java.util.*
import javax.inject.Singleton

@Singleton
interface LoginRepositoryPort {
    fun findLoginById(id: UUID): Login?
}