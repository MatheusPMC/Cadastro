package com.login.infra.exception

class LoginAlreadyExistsException(message : String = "Endereço já existente.") : Exception(message) {
}