package com.register.application

import com.register.application.controller.RegisterController
import com.register.application.controller.handler.cpfException.CpfValidateException
import com.register.application.controller.handler.registerException.RegisterException
import com.register.application.dto.RegisterDto
import com.register.core.domain.Register
import com.register.core.port.RegisterServicePort
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import io.micronaut.http.HttpStatus
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class RegisterControllerTest : AnnotationSpec() {


    val registerService = mockk<RegisterServicePort>(relaxed = true)
    val registerController = RegisterController(registerService)

    lateinit var register: Register
    lateinit var registerDto: RegisterDto

    @BeforeEach
    fun setUp() {
        registerDto =
            RegisterDto(UUID.randomUUID(), "Matheus", 30, "175.688.450-10", "test@gmail.com", "1799883322")
        register =
            Register(UUID.randomUUID(), "Matheus", 30, "175.688.450-10", "test@gmail.com", "1799883322")
    }

    @Test
    fun `create registration successfully`() {
        every { registerService.createRegister(register) } returns registerDto
        val result = registerController.create(registerDto)
        result.status shouldBe HttpStatus.CREATED
        result.body().shouldBeTypeOf<RegisterDto>()
    }

    @Test
    fun `update registration successfully`() {
        every { registerService.registerUpdate(register) } returns registerDto
        val result = registerController.update("175.688.450-10", registerDto)
        result.status shouldBe HttpStatus.OK
        result.body().shouldBeTypeOf<RegisterDto>()
    }

    @Test
    fun `must not register with invalid cpf`() {
        val registerDto = RegisterDto(
            UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus",
            30, "145632", "test@gmail.com", "1799883322"
        )
        shouldThrow<CpfValidateException> {
            registerController.create(registerDto)
        }
    }

    @Test
    fun `must not register with empty cpf`() {
        val registerDto = RegisterDto(
            UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"), "Matheus",
            30, "", "test@gmail.com", "1799883322"
        )
        shouldThrow<CpfValidateException> {
            registerController.create(registerDto)
        }
    }

    @Test
    fun `must not register with empty id`() {
        val registerDto = RegisterDto(
            null, "Matheus",30, "175.688.450-10", "test@gmail.com", "1799883322"
        )
        shouldThrow<RegisterException> {
            registerController.update(registerDto.cpf, registerDto)
        }
    }
}