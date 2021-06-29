package com.register.infra

import com.register.application.dto.RegisterDto
import com.register.core.domain.Register
import com.register.infra.entity.RegisterEntity
import com.register.infra.repository.RegisterEntityRepository
import com.register.infra.service.RegisterEntityService
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*


@MicronautTest
class RegisterEntityServiceTest : AnnotationSpec() {
    val registerEntityRepository = mockk<RegisterEntityRepository>()
    val registerEntityService = RegisterEntityService(registerEntityRepository)

    lateinit var register: Register
    lateinit var registerDto: RegisterDto
    lateinit var registerEntity: RegisterEntity

    @BeforeEach
    fun setUp() {
        registerDto =
            RegisterDto(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30,
                "175.688.450-10", "test@test.com", "1799883322")
        register =
            Register(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30,
                "175.688.450-10", "test@test.com", "1799883322")
        registerEntity =
            RegisterEntity(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30,
                "175.688.450-10", "test@test.com", "1799883322")
    }

    @Test
    fun `should return success on insert method`() {
        every { registerEntityRepository.registerSave(registerEntity) } answers { registerEntity }
        val result = registerEntityService.registerAdd(registerEntity)
        result shouldBe register
    }

    @Test
    fun `should return success on update method`() {
        every { registerEntityRepository.registerUploaded(registerEntity) } answers { registerEntity }
        val result = registerEntityService.registerUpdate(registerEntity)
        result shouldBe register
    }
}