package com.address.application

import com.address.application.controller.CepController
import com.address.application.dto.AddressDto
import com.address.application.dto.CepDto
import com.address.application.postalCode.CepClient
import com.address.core.domain.Address
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.every
import io.mockk.mockk
import java.util.*

@MicronautTest
class CepControllerTest: AnnotationSpec() {

    val cepClient = mockk<CepClient>()
    val cepController = CepController(cepClient)

    lateinit var addressDto: AddressDto
    lateinit var cepDto: CepDto

    @BeforeEach
    fun setUp() {
        cepDto =
            CepDto("Valentim Silva","Terra Roxa","SP","14745-000")
        addressDto =
            AddressDto(null,"Valentim Silva",0,"Terra Roxa","SP", "14745-000")

    }
/*
    @Test
    fun `create registration successfully`() {
        var cep = "14745000"
        every { cepClient.consulta(cep) } returns HttpResponse.ok()
        val consulta = cepClient.consulta(cep).body()
        val result = cepController.getCep("14745-000").body()
        result shouldBe HttpStatus.OK
    }

 */

}