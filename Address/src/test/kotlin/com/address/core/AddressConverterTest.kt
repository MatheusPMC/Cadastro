package com.address.core

import com.address.application.dto.AddressDto
import com.address.core.domain.Address
import com.address.core.mapper.AddressConverter
import com.address.infra.entity.AddressEntity

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import java.util.*

@MicronautTest
class AddressConverterTest : AnnotationSpec() {
    val addressConverter = AddressConverter

    lateinit var addressDto: AddressDto
    lateinit var address: Address
    lateinit var addressEntity: AddressEntity

    @BeforeEach
    fun setUp() {
        addressDto =
            AddressDto(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"sao vicente",231,"Terra Roxa","SP", "14745-000")
        address =
            Address(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"sao vicente",231,"Terra Roxa","SP", "14745-000")
        addressEntity =
            AddressEntity(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"sao vicente",231,"Terra Roxa","SP", "14745-000")
    }

    @Test
    fun `should convert the addressDtoToAddress`() {
        val result = addressConverter.addressDtoToAddress(addressDto)
        result shouldBe address
    }

    @Test
    fun `should convert the addressToAddressEntity`() {
        val result = addressConverter.addressToAddressEntity(address)
        result shouldBe addressEntity
    }

    @Test
    fun `should convert the addressEntityToAddress`() {
        val result = addressConverter.addressEntityToAddress(addressEntity)
        result shouldBe address
    }

    @Test
    fun `should convert the addressToAddressDto`() {
        val result = addressConverter.addressToAddressDto(address)
        result shouldBe addressDto
    }
}