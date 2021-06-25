package com.address.infra

import com.address.infra.entity.AddressEntity
import com.address.infra.exception.AddressAlreadyExistsException
import com.address.infra.nats.AddressClient
import com.address.infra.repository.impl.AddressEntityRepositoryImpl
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class AddressEntityRepositoryImplTest : AnnotationSpec() {
    val addressClient = mockk<AddressClient>()
    val addressEntityRepositoryImpl = AddressEntityRepositoryImpl(addressClient)

    lateinit var addressEntity: AddressEntity

    @BeforeEach
    fun setUp() {
        addressEntity =
            AddressEntity(UUID.fromString("970305d4-fcda-48f6-b7c1-6d16be7cd4e2"),"Valentim Silva",231,"Terra Roxa","SP", "14745-000")
    }

    @Test
    fun `should return success on insert method`() {
        every { addressClient.addressSave(addressEntity) } answers { addressEntity }
        val result = addressEntityRepositoryImpl.addressSave(addressEntity)
        result shouldBe addressEntity
    }

    @Test
    fun `should return success on update method`() {
        every { addressClient.addressUpdate(addressEntity) } answers { addressEntity }
        val result = addressEntityRepositoryImpl.addressUploaded(addressEntity)
        result shouldBe addressEntity
    }

    @Test
    fun `should return failed on update method`() {
        var registerEntityTest = AddressEntity(null, "Valentim Silva",231,"Terra Roxa","SP", "14745-000")
        every { addressClient.addressUpdate(registerEntityTest) } throws AddressAlreadyExistsException()
        val result = shouldThrow<AddressAlreadyExistsException> {
            addressEntityRepositoryImpl.addressUploaded(registerEntityTest)
        }
        result.message shouldBe "invalid arguments"
    }

    @Test
    fun `should return failed on insert method`() {
        var registerEntityTest = AddressEntity(null, "Valentim Silva",231,"Terra Roxa","SP", "14745-000")
        every { addressClient.addressSave(registerEntityTest) } throws AddressAlreadyExistsException()
        val result = shouldThrow<AddressAlreadyExistsException> {
            addressEntityRepositoryImpl.addressSave(registerEntityTest)
        }
        result.message shouldBe "invalid arguments"
    }
}