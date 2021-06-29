package com.address.infra

import com.address.application.dto.AddressDto
import com.address.core.domain.Address
import com.address.infra.entity.AddressEntity
import com.address.infra.repository.AddressEntityRepository
import com.address.infra.service.AddressEntityService
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class AddressEntityServiceTest : AnnotationSpec() {
    val addressEntityRepository = mockk<AddressEntityRepository>()
    val addressEntityService = AddressEntityService(addressEntityRepository)

    lateinit var addressDto: AddressDto
    lateinit var address: Address
    lateinit var addressEntity: AddressEntity

    @BeforeEach
    fun setUp() {
        addressDto =
            AddressDto(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"sao vicente",
                231,"Terra Roxa","SP", "14745-000")
        address =
            Address(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"sao vicente",
                231,"Terra Roxa","SP", "14745-000")
        addressEntity =
            AddressEntity(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"sao vicente",
                231,"Terra Roxa","SP", "14745-000")
    }

    @Test
    fun `should return success on insert method`() {
        every { addressEntityRepository.addressSave(addressEntity) } answers { addressEntity }
        val result = addressEntityService.addressAdd(addressEntity)
        result shouldBe address
    }

    @Test
    fun `should return success on update method`() {
        every { addressEntityRepository.addressUploaded(addressEntity) } answers { addressEntity }
        val result = addressEntityService.addressUpdate(addressEntity)
        result shouldBe address
    }
}