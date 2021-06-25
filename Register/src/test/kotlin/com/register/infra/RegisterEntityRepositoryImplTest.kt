package com.register.infra

import com.register.infra.entity.RegisterEntity
import com.register.infra.exception.RegisterAlreadyExistsException
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
            RegisterEntity(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
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
        var registerEntityTest = RegisterEntity(null, "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
        every { registerClient.registerUploaded(registerEntityTest) } throws RegisterAlreadyExistsException()

        val result = shouldThrow<RegisterAlreadyExistsException> {
            registerEntityRepositoryImpl.registerUploaded(registerEntityTest)
        }
        result.message shouldBe "invalid arguments"
    }

    @Test
    fun `should return failed on insert method`() {
        var registerEntityTest = RegisterEntity(null, "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
        every { registerClient.registerSave(registerEntityTest) } throws RegisterAlreadyExistsException()

        val result = shouldThrow<RegisterAlreadyExistsException> {
            registerEntityRepositoryImpl.registerSave(registerEntityTest)
        }

        result.message shouldBe "invalid arguments"
    }
}