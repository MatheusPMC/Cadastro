package com.register.application.util

import com.register.application.controller.handler.cpfException.CpfValidateException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import io.micronaut.test.extensions.kotest.annotation.MicronautTest

@MicronautTest
class CpfUtilTest: AnnotationSpec() {
    private val cpfUtil = CpfUtil

    @Test
    fun `deve aceitar cpf valido e rotonar-lo limpo`() {

        val result = cpfUtil.validateCPF("558.528.230-15")

        result shouldBe "55852823015"
    }

    @Test
    fun `não deve aceitar cpf com formato invalido`() {

        shouldThrow<CpfValidateException> {
            cpfUtil.validateCPF("")
        }

        shouldThrow<CpfValidateException> {
            cpfUtil.validateCPF("46846")
        }

        shouldThrow<CpfValidateException> {
            cpfUtil.validateCPF("46846646846846846")
        }

        shouldThrow<CpfValidateException> {
            cpfUtil.validateCPF("468ab")
        }

        shouldThrow<CpfValidateException> {
            cpfUtil.validateCPF("22222222222")
        }
    }

    @Test
    fun `não deve aceitar cpf com dígitos verificadores inválidos`() {
        shouldThrow<CpfValidateException> {
            cpfUtil.validateCPF("13546789719")
        }
    }
}
