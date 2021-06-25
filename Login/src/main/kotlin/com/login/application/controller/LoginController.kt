package com.login.application.controller

import com.login.application.dto.LoginDto
import com.login.application.exception.ErrorMessage
import com.login.core.port.LoginServicePort
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import jnr.ffi.Address
import java.util.*

@Controller("login")
class LoginController(private val loginServicePort: LoginServicePort) {
    @Get("/{id}")
    fun getId(@PathVariable id: UUID): HttpResponse<Any> {
        var result = loginServicePort.findById(id) != null
        return HttpResponse.ok(HttpStatus.OK).body(this.loginServicePort.findById(id))
    }
}