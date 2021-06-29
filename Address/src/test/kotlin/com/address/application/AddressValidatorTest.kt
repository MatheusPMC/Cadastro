package com.address.application

import com.address.application.dto.AddressDto
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.micronaut.validation.validator.Validator
import java.util.*

@MicronautTest
class AddressValidatorTest : AnnotationSpec() {
    val validator = Validator.getInstance()

    @Test
    fun `must not accept the empty street`() {
        val registerDto = AddressDto(UUID.randomUUID(), "", 231, "Terra Roxa", "SP", "14745-000")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 1
    }

    @Test
    fun `must not accept the empty, negative number`() {
        val registerDto = AddressDto(UUID.randomUUID(), "sao vicente", 0, "Terra Roxa", "SP", "14745-000")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 1
    }

    @Test
    fun `must not accept the empty city`() {
        val registerDto = AddressDto(UUID.randomUUID(), "sao vicente", 231, "", "SP", "14745-000")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 1
    }

    @Test
    fun `must not accept empty state or invalid format`() {
        val registerDto = AddressDto(UUID.randomUUID(), "sao vicente", 231, "Terra Roxa", "", "14745-000")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 1
    }

    @Test
    fun `must not accept empty postalcode or invalid format`() {
        val registerDto = AddressDto(UUID.randomUUID(), "sao vicente", 231, "Terra Roxa", "SP", "")
        val constraintViolations = validator.validate(registerDto)
        constraintViolations.size shouldBe 2
    }
}