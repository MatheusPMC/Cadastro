package com.address.application.postalCode

import com.address.application.dto.AddressDto
import com.address.application.dto.CepDto
import com.address.core.domain.Address
import com.address.core.mapper.AddressConverter
import com.address.infra.entity.AddressEntity

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import java.util.*

@MicronautTest
class CepConverterTest : AnnotationSpec() {
    val cepConverter = CepConverter

    lateinit var cepDto: CepDto
    lateinit var addressDto: AddressDto

    @BeforeEach
    fun setUp() {
        cepDto =
            CepDto("sao vicente","Terra Roxa","SP","14745-000")
        addressDto =
            AddressDto(null,"sao vicente",0,"Terra Roxa","SP", "14745-000")
    }

    @Test
    fun `should convert the addressDtoToAddress`() {
        val result = cepConverter.cepDtoToAddressDto(cepDto)
        result shouldBe addressDto
    }
}