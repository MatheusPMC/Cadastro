package com.address.application.util

import com.address.application.controller.handler.AddressException
import com.address.application.dto.AddressDto
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import java.util.*

@MicronautTest
class AddressUtilTest : AnnotationSpec() {
    private val addressUtil = AddressUtil

    @Test
    fun `should not accept id with null digits`() {
        var addressDto =
            AddressDto(null, "Valentim Silva", 231, "Terra Roxa", "SP", "14745-000")
        shouldThrow<AddressException> {
            addressUtil.isValid(addressDto)
        }
    }

    @Test
    fun `should accept id with check digits`() {
        var addressDto =
            AddressDto(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),
                "Valentim Silva", 231, "Terra Roxa", "SP", "14745-000")
        var result = addressUtil.isValid(addressDto)
        result shouldBe addressDto
        }
    }
