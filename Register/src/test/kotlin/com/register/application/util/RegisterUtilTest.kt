package com.register.application.util

import com.register.application.dto.RegisterDto
import com.register.application.controller.handler.registerException.RegisterException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.AnnotationSpec
import io.micronaut.test.extensions.kotest.annotation.MicronautTest

@MicronautTest
class RegisterUtilTest: AnnotationSpec() {
    private val registerUtil = RegisterUtil

    @Test
    fun `não deve aceitar cpf com dígitos verificadores inválidos`() {
        var registerDto = RegisterDto(null, "Matheus", 30, "408.933.688-06", "mtixti@gmail.com", "17-991322179")
        shouldThrow<RegisterException> {
            registerUtil.isValid(registerDto)
        }
    }
}
