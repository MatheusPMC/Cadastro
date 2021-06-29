package com.register.infra

import com.register.application.controller.handler.registerException.RegisterException
import com.register.infra.entity.RegisterEntity
import com.register.infra.exception.RegisterExceptionImpl
import com.register.infra.nats.RegisterClient
import com.register.infra.repository.impl.RegisterEntityRepositoryImpl
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class RegisterEntityRepositoryImplTest : AnnotationSpec() {

    val registerClient = mockk<RegisterClient>(relaxed = true)
    val registerEntityRepositoryImpl = RegisterEntityRepositoryImpl(registerClient)

    lateinit var registerEntity: RegisterEntity

    @BeforeEach
    fun setUp() {
        registerEntity =
            RegisterEntity(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30,
                "175.688.450-10", "test@test.com", "1799883322")
    }

    @Test
    fun `should return success on insert method`() {
        every { registerClient.registerSave(registerEntity) } answers { registerEntity }
        val result = registerEntityRepositoryImpl.registerSave(registerEntity)
        result shouldBe registerEntity
    }

    @Test
    fun `should return success on update method`() {
        every { registerClient.registerUploaded(registerEntity) } answers { registerEntity }
        val result = registerEntityRepositoryImpl.registerUploaded(registerEntity)
        result shouldBe registerEntity
    }

    @Test
    fun `should return failed on update method`() {
        var registerEntityTest = RegisterEntity(null, "Matheus", 30, "",
            "test@test.com", "1799883322")
        every { registerClient.registerUploaded(registerEntityTest) } throws RegisterExceptionImpl()
        shouldThrow<RegisterExceptionImpl> {
            registerEntityRepositoryImpl.registerUploaded(registerEntityTest)
        }
    }

    @Test
    fun `should return failed on insert method`() {
        var registerEntityTest = RegisterEntity(null, "Matheus", 30, "",
            "test@test.com", "1799883322")
        every { registerClient.registerSave(registerEntityTest) } throws RegisterExceptionImpl()
        shouldThrow<RegisterExceptionImpl> {
            registerEntityRepositoryImpl.registerSave(registerEntityTest)
        }
    }
}