package com.register.infra.exception

class RegisterAlreadyExistsException(message : String = "Endereço já existente.") : Exception(message) {
}