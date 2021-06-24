package com.register.application.controller

import com.register.application.dto.RegisterDto
import com.register.application.util.CpfUtil
import com.register.application.util.RegisterUtil
import com.register.core.mapper.RegisterConverter
import com.register.core.port.RegisterServicePort
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import java.util.*
import javax.validation.Valid

@Validated
@Controller("register")
class RegisterController(private val registerService: RegisterServicePort) {

    @Post
    fun create(@Body @Valid registerDto: RegisterDto): HttpResponse<Any> {
            registerDto.id = UUID.randomUUID()
            CpfUtil.validateCPF(registerDto.cpf)
            val result = registerService.createRegister(RegisterConverter.registerDtoToRegister(registerDto))
            return HttpResponse.created(HttpStatus.CREATED).body(result)
    }

    @Put("/{cpf}")
    fun update(@PathVariable cpf: String, @Body @Valid registerDto: RegisterDto): HttpResponse<Any> {
            RegisterUtil.isValid(registerDto)
            CpfUtil.validateCPF(cpf)
            val registerDto = RegisterDto(registerDto.id, registerDto.name, registerDto.age, cpf, registerDto.phone)
        return HttpResponse.ok(HttpStatus.OK)
                .body(registerService.registerUpdate(RegisterConverter.registerDtoToRegister(registerDto)))
    }
}

