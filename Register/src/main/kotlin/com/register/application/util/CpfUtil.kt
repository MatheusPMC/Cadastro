package com.register.application.util

import com.register.application.util.handler.exception.CpfValidateException


class CpfUtil {
    companion object {
        fun validateCPF(cpf : String): String  {

            val cpfClean = cpf.clean()

            if (!validaFormato(cpfClean)) throw CpfValidateException()

            if (!validaDigitos(cpfClean)) throw CpfValidateException()

            return cpfClean
        }

        private fun String.clean() = this.filterNot { it in listOf('.', '-') }


        private fun validaFormato(cpf: String): Boolean {

            // check if size is eleven
            if (cpf.length != 11) return false

            // check if is number
            if (cpf.any { !it.isDigit() }) return false

            // check if is a number
            if (cpf in cpfsInvalidos) return false

            return true
        }

        private val cpfsInvalidos = listOf(
            "00000000000",
            "11111111111",
            "22222222222",
            "33333333333",
            "44444444444",
            "55555555555",
            "66666666666",
            "77777777777",
            "88888888888",
            "99999999999"
        )

        private fun validaDigitos(cpf: String): Boolean {
            val primeirosNoveDigitos = cpf.substring(0..8)
            val digitos = cpf.substring(9..10)

            val numeros = primeirosNoveDigitos.map { it.toString().toInt() }
            val primeiro = numeros.calculaPrimeiroDigito()
            val segundo = numeros.calculaSegundoDigito(primeiro)


            return "$primeiro$segundo" == digitos
        }

        private fun List<Int>.calculaPrimeiroDigito(): Int {
            val primeirosNoveDigitos = this
            val pesos = (10 downTo 2).toList()
            val soma = primeirosNoveDigitos.withIndex().sumOf { (index, element) -> pesos[index] * element }

            val resto = soma % 11
            return if(resto < 2) 0 else 11 - resto
        }

        private fun List<Int>.calculaSegundoDigito(primeiro: Int): Int {
            val primeirosDezDigitos = this + primeiro
            val pesos = (11 downTo 2).toList()
            val soma = primeirosDezDigitos.withIndex().sumOf { (index, element) -> pesos[index] * element }

            val resto = soma % 11
            return if (resto < 2) 0 else 11 - resto
        }

    }
}


