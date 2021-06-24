package com.register.application

import com.register.application.controller.RegisterController
import com.register.application.dto.RegisterDto
import com.register.core.domain.Register
import com.register.core.port.RegisterServicePort
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import io.micronaut.http.HttpStatus
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.mockk
import io.mockk.every
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
            RegisterDto(UUID.randomUUID(), "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
        register =
            Register(UUID.randomUUID(), "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
    }

    @Test
    fun `create registration successfully`() {
        every { registerService.createRegister(register) } returns  registerDto
        val result = registerController.create(registerDto)
        result.status shouldBe HttpStatus.CREATED
        result.body().shouldBeTypeOf<RegisterDto>()
    }

    @Test
    fun `update registration successfully`() {
        every { registerService.registerUpdate(register) } returns  registerDto
        val result = registerController.update("408.933.688-06",registerDto)
        result.status shouldBe HttpStatus.OK
        result.body().shouldBeTypeOf<RegisterDto>()
    }
}