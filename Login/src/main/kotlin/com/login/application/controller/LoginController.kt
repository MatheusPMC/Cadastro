package com.login.application.controller

import com.login.core.port.LoginServicePort
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import java.util.*

@Controller("login")
class LoginController(private val loginServicePort: LoginServicePort) {
    @Get("/{id}")
    fun getId(@PathVariable id: UUID): HttpResponse<Any> {
        return HttpResponse.ok(HttpStatus.OK).body(loginServicePort.findById(id))
    }
}