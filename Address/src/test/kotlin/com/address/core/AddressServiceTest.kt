package com.address.core

import com.address.application.dto.AddressDto
import com.address.core.domain.Address
import com.address.core.port.AddressRepositoryPort
import com.address.core.service.AddressService
import com.address.infra.entity.AddressEntity
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class AddressServiceTest : AnnotationSpec() {
    val addressRepositoryPort = mockk<AddressRepositoryPort>()
    val addressService = AddressService(addressRepositoryPort)

    lateinit var addressDto: AddressDto
    lateinit var address: Address
    lateinit var addressEntity: AddressEntity

    @BeforeEach
    fun setUp() {
        addressDto =
            AddressDto(
                UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),
                "sao vicente", 231, "Terra Roxa", "SP", "14745-000"
            )
        address =
            Address(
                UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),
                "sao vicente", 231, "Terra Roxa", "SP", "14745-000"
            )
        addressEntity =
            AddressEntity(
                UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),
                "sao vicente", 231, "Terra Roxa", "SP", "14745-000"
            )
    }

    @Test
    fun `should return success on insert method`() {
        every { addressRepositoryPort.addressAdd(addressEntity) } answers { address }
        val result = addressService.addressAdd(address)
        result shouldBe addressDto
    }

    @Test
    fun `should return success on update method`() {
        every { addressRepositoryPort.addressUpdate(addressEntity) } answers { address }
        val result = addressService.addressUpdate(address)
        result shouldBe addressDto
    }
}