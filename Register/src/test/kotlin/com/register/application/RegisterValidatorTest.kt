package com.register.application

import com.register.application.dto.RegisterDto
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.micronaut.validation.validator.Validator
import java.util.*

@MicronautTest
class RegisterValidatorTest : AnnotationSpec() {
    val validator = Validator.getInstance()

    @Test
    fun `must not accept the empty name`() {
        val registerDto = RegisterDto(UUID.randomUUID(), "", 30, "175.688.450-10",
            "test@test.com", "1799883322")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 2
    }

    @Test
    fun `must not accept the empty, negative age`() {
        val registerDto = RegisterDto(UUID.randomUUID(), "Matheus", 0, "175.688.450-10",
            "test@test.com", "1799883322")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 2
    }

    @Test
    fun `must not accept the empty cpf`() {
        val registerDto = RegisterDto(UUID.randomUUID(), "Matheus", 30, "",
            "test@test.com", "1799883322")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 2
    }

    @Test
    fun `must not accept empty email or invalid format`() {
        val registerDto = RegisterDto(UUID.randomUUID(), "Matheus", 30, "175.688.450-10",
            "", "1799883322")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 3
    }

    @Test
    fun `must not accept empty phone or invalid format`() {
        val registerDto = RegisterDto(UUID.randomUUID(), "Matheus", 30, "175.688.450-10",
            "test@test.com", "")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 2
    }
}