package com.register.core

import com.register.application.dto.RegisterDto
import com.register.core.domain.Register
import com.register.core.mapper.RegisterConverter
import com.register.infra.entity.RegisterEntity
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import java.util.*

@MicronautTest
class RegisterConverterTest : AnnotationSpec() {
    val registerConverter = RegisterConverter

    lateinit var register: Register
    lateinit var registerDto: RegisterDto
    lateinit var registerEntity: RegisterEntity

    @BeforeEach
    fun setUp() {
        registerDto =
            RegisterDto(
                UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30,
                "175.688.450-10", "test@test.com", "1799883322"
            )
        register =
            Register(
                UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30,
                "175.688.450-10", "test@test.com", "1799883322"
            )
        registerEntity =
            RegisterEntity(
                UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30,
                "175.688.450-10", "test@test.com", "1799883322"
            )
    }

    @Test
    fun `should convert the registerDtoToRegister`() {
        val result = registerConverter.registerDtoToRegister(registerDto)
        result shouldBe register
    }

    @Test
    fun `should convert the registerToRegisterEntity`() {
        val result = registerConverter.registerToRegisterEntity(register)
        result shouldBe registerEntity
    }

    @Test
    fun `should convert the registerEntityToRegister`() {
        val result = registerConverter.registerEntityToRegister(registerEntity)
        result shouldBe register
    }

    @Test
    fun `should convert the registerToRegisterDto`() {
        val result = registerConverter.registerToRegisterDto(register)
        result shouldBe registerDto
    }
}