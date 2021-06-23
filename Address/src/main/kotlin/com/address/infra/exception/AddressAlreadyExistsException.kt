package com.address.infra.exception

class AddressAlreadyExistsException(message : String = "Endereço já existente.") : Exception(message) {
}