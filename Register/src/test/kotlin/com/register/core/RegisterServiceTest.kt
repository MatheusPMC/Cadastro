package com.register.core

import com.register.application.dto.RegisterDto
import com.register.core.domain.Register
import com.register.infra.entity.RegisterEntity
import com.register.core.port.RegisterRepositoryPort
import com.register.core.service.RegisterService

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class RegisterServiceTest : AnnotationSpec() {
    val registreServicePort = mockk<RegisterRepositoryPort>()
    val registerService = RegisterService(registreServicePort)

    lateinit var register: Register
    lateinit var registerDto: RegisterDto
    lateinit var registerEntity: RegisterEntity

    @AnnotationSpec.BeforeEach
    fun setUp() {
        registerDto =
            RegisterDto(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
        register =
            Register(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
        registerEntity =
            RegisterEntity(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
    }

    @Test
    fun `should return success on insert method`() {
        every { registreServicePort.registerAdd(registerEntity) } answers { register }
        val result = registerService.createRegister(register)
        result shouldBe registerDto
    }

    @Test
    fun `should return success on update method`() {
        every { registreServicePort.registerUpdate(registerEntity) } answers { register }
        val result = registerService.registerUpdate(register)
        result shouldBe registerDto
    }

}