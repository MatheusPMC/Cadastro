package com.login.application.rest

import com.login.application.exception.ErrorMessage
import com.login.core.port.LoginServicePort
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import java.util.*

@Controller("login")
class LoginControlle(private val loginServicePort: LoginServicePort) {
    @Get("/{id}")
    fun getId(@PathVariable id: UUID): HttpResponse<Any> {
        return if (loginServicePort.findById(id) != null) {
            HttpResponse.ok(HttpStatus.OK).body(this.loginServicePort.findById(id))
        } else {
            HttpResponse.notFound(HttpStatus.NOT_FOUND)
                .body(ErrorMessage("O Endereço do ID: $id não foi encontrado!"))
        }
    }
}