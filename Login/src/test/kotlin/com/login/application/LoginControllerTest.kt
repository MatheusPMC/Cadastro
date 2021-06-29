package com.login.application

import com.login.application.controller.LoginController
import com.login.application.dto.LoginDto
import com.login.core.domain.Login
import com.login.core.port.LoginServicePort
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.http.HttpStatus
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class LoginControllerTest : AnnotationSpec() {
    val loginService = mockk<LoginServicePort>()
    val loginController = LoginController(loginService)

    lateinit var loginDto: LoginDto
    lateinit var login: Login

    @BeforeEach
    fun setUp() {
        loginDto = LoginDto(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Matheus", 30,
            "175.688.450-10", "test@test.com", "1799883322","sao vicente",222,
            "Terra Roxa", "SP","14745-000")

        login = Login(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Matheus", 30,
            "175.688.450-10", "test@test.com", "1799883322","sao vicente",222,
            "Terra Roxa", "SP","14745-000")
    }

    @Test
    fun `create registration successfully`() {
        val id = UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2")
        every { loginService.findById(id) } returns loginDto
        val result = loginController.getId(id)
        result.status shouldBe HttpStatus.OK
        result.body() shouldBe loginDto
    }
}