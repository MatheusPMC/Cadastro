package com.address.application.Exception

class ErrorMessage (message: String = "Cep não foi encontrado!") : Exception(message) {
}