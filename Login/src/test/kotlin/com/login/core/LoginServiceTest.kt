package com.login.core

import com.login.application.dto.LoginDto
import com.login.core.domain.Login
import com.login.core.port.LoginRepositoryPort
import com.login.core.service.LoginService
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class LoginServiceTest: AnnotationSpec() {
    val loginRepositoryPort = mockk<LoginRepositoryPort>()
    val loginService = LoginService(loginRepositoryPort)

    lateinit var loginDto: LoginDto
    lateinit var login: Login

    @BeforeEach
    fun setUp() {

        loginDto = LoginDto(
            UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Matheus", 30,
            "175.688.450-10", "test@test.com", "1799883322","sao vicente",222,
            "Terra Roxa", "SP","14745-000")

        login = Login(
            UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Matheus", 30,
            "175.688.450-10", "test@test.com", "1799883322","sao vicente",222,
            "Terra Roxa", "SP","14745-000")
    }

    @Test
    fun `should return success on findLoginById method`() {
        val id = UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2")
        every { loginRepositoryPort.findLoginById(any()) } answers { login }
        val result = loginService.findById(id)
        result shouldBe loginDto
    }
}