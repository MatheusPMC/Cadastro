package com.register.infra.exception

class RegisterAlreadyExistsException(message : String = "invalid arguments") : Exception(message) {
}