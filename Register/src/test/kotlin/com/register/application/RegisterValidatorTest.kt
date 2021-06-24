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
        val registerDto = RegisterDto(UUID.randomUUID(), "", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 1
    }

    @Test
    fun `must not accept the empty, negative age`() {
        val registerDto = RegisterDto(UUID.randomUUID(), "Matheus", 0, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 1
    }

    @Test
    fun `must not accept the empty cpf`() {
        val registerDto = RegisterDto(UUID.randomUUID(), "Matheus", 30, "", "mtixti@gmail.com", "17-991322179")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 1
    }

    @Test
    fun `must not accept empty email or invalid format`() {
        val registerDto = RegisterDto(UUID.randomUUID(), "Matheus", 30, "408.933.688-06", "", "17-991322179")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 2
    }

    @Test
    fun `must not accept empty phone or invalid format`() {
        val registerDto = RegisterDto(UUID.randomUUID(), "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 2
    }
}