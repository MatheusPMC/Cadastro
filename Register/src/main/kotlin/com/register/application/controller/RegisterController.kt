package com.register.application.controller

import com.register.application.dto.RegisterDto
import com.register.application.util.CpfUtil
import com.register.application.util.handler.ErrorMessage
import com.register.core.mapper.RegisterConverter
import com.register.core.port.RegisterServicePort
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import java.lang.Exception
import java.util.*
import javax.validation.Valid

@Validated
@Controller("register")
class RegisterController(private val registerService: RegisterServicePort) {

    @Get
    fun getAll(): MutableHttpResponse<List<RegisterDto>>? {
        val listRegister = RegisterConverter.registerToRegisterDtoList(registerService.findRegistersList())
        return HttpResponse.ok(HttpStatus.OK).body(listRegister)
    }

    @Get("/{cpf}")
    fun getGetCpf(@PathVariable cpf: String): HttpResponse<Any> {
        return if (registerService.findByCpf(cpf) != null) {
            val register = registerService.findByCpf(cpf)
            HttpResponse.ok(register)
        } else {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
                .body(ErrorMessage("O Cliente do CPF: $cpf não foi encontrado!"))
        }
    }

    @Post
    fun create(@Body registerDto: RegisterDto): HttpResponse<Any> {
        return try {
            registerDto.id = UUID.randomUUID()
            CpfUtil.validateCPF(registerDto.cpf)
            val result = registerService.createRegister(RegisterConverter.registerDtoToRegister(registerDto))
            return HttpResponse.created(HttpStatus.CREATED).body(result)
        } catch (e: Exception) {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
                .body(ErrorMessage("Os dados estão incorretos!"))
        }
    }

    @Put("/{cpf}")
    fun update(@PathVariable cpf: String, @Body @Valid registerDto: RegisterDto): HttpResponse<Any> {
        return if (registerService.findByCpf(cpf) != null) {
            val registerDto = RegisterDto(registerDto.id, registerDto.name, registerDto.age, cpf, registerDto.phone)
            HttpResponse.ok(HttpStatus.OK)
                .body(registerService.registerUpdate(RegisterConverter.registerDtoToRegister(registerDto)))
        } else {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
                .body(ErrorMessage("O Cliente do CPF: $cpf não foi encontrado!"))
        }
    }

    @Delete("/{cpf}")
    fun delete(@PathVariable cpf: String): HttpResponse<Any> {
        return if (registerService.findByCpf(cpf) != null) {
            HttpResponse.ok(HttpStatus.NO_CONTENT).body(this.registerService.delete(cpf))
        } else {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
                .body(ErrorMessage("O Cliente do CPF: $cpf não foi encontrado!"))
        }
    }
}

