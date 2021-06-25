package com.address.application

import com.address.application.controller.AddressController
import com.address.application.dto.AddressDto
import com.address.core.domain.Address
import com.address.core.port.AddressServicePort
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf
import io.micronaut.http.HttpStatus
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class AddressControllerTest : AnnotationSpec() {
    val addressService = mockk<AddressServicePort>()
    val addressController = AddressController(addressService)

    lateinit var addressDto: AddressDto
    lateinit var address: Address

    @BeforeEach
    fun setUp() {
        addressDto =
            AddressDto(
                UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),
                "Valentim Silva", 231, "Terra Roxa", "SP", "14745-000"
            )
        address =
            Address(
                UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),
                "Valentim Silva", 231, "Terra Roxa", "SP", "14745-000"
            )
    }

    @Test
    fun `create registration successfully`() {
        every { addressService.addressAdd(address) } returns  addressDto
        val result = addressController.create(addressDto)
        result.status shouldBe HttpStatus.CREATED
        result.body().shouldBeTypeOf<AddressDto>()
    }

    @Test
    fun `update registration successfully`() {
        val id = UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2")
        every { addressService.addressUpdate(address) } returns  addressDto
        val result = addressController.update(id,addressDto)
        result.status shouldBe HttpStatus.OK
        result.body().shouldBeTypeOf<AddressDto>()
    }
}