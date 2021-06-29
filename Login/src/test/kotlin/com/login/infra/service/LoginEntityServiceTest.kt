package com.login.infra.service

import com.login.application.dto.LoginDto
import com.login.core.domain.Login
import com.login.infra.entity.LoginEntity
import com.login.infra.repository.LoginEntityRepository
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class LoginEntityServiceTest: AnnotationSpec() {
    val loginEntityRepository = mockk<LoginEntityRepository>()
    val loginEntityService = LoginEntityService(loginEntityRepository)

    lateinit var login: Login
    lateinit var loginEntity: LoginEntity

    @BeforeEach
    fun setUp() {

        login = Login(
            UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Matheus", 30,
            "175.688.450-10", "test@test.com", "1799883322","sao vicente",222,
            "Terra Roxa", "SP","14745-000")

        loginEntity = LoginEntity(
            UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Matheus", 30,
            "175.688.450-10", "test@test.com", "1799883322","sao vicente",222,
            "Terra Roxa", "SP","14745-000")
    }

    @Test
    fun `should return success on insert method`() {
        val id = UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2")
        every { loginEntityRepository.findAddressById(any()) } answers { loginEntity }
        val result = loginEntityService.findLoginById(id)
        result shouldBe login
    }
}