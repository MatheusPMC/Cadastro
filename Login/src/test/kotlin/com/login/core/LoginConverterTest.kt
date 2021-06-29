package com.login.core

import com.login.application.dto.LoginDto
import com.login.core.domain.Login
import com.login.core.mapper.LoginConverter
import com.login.infra.entity.LoginEntity
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import java.util.*


@MicronautTest
class LoginConverterTest: AnnotationSpec() {

    val longinConverter = LoginConverter

    lateinit var loginDto: LoginDto
    lateinit var login: Login
    lateinit var loginEntity: LoginEntity

    @BeforeEach
    fun setUp() {

        loginDto = LoginDto(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Matheus", 30,
            "175.688.450-10", "test@test.com", "1799883322","sao vicente",222,
            "Terra Roxa", "SP","14745-000")

        login = Login(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Matheus", 30,
            "175.688.450-10", "test@test.com", "1799883322","sao vicente",222,
            "Terra Roxa", "SP","14745-000")

        loginEntity = LoginEntity(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Matheus", 30,
            "175.688.450-10", "test@test.com", "1799883322","sao vicente",222,
            "Terra Roxa", "SP","14745-000")
    }

    @Test
    fun `should convert the addressEntityToAddress`() {
        val result = longinConverter.loginEntityToLogin(loginEntity)
        result shouldBe login
    }

    @Test
    fun `should convert the addressToAddressDto`() {
        val result = longinConverter.loginToLoginDto(login)
        result shouldBe loginDto
    }

}