package com.address.application.postalCode

import com.address.application.dto.AddressDto
import com.address.application.dto.CepDto

class CepConverter {
    companion object {
        fun cepDtoToAddressDto(cepDTO: CepDto) =
            AddressDto(null,cepDTO.logradouro,0,cepDTO.localidade,cepDTO.uf,cepDTO.cep)
    }
}