package com.register.application.controller.handler.registerException

import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Produces
@Singleton
@Requires(classes = [RegisterException::class, ExceptionHandler::class])
class RegisterExceptionHandler : ExceptionHandler<RegisterException?, HttpResponse<*>> {

    val LOG: Logger = LoggerFactory.getLogger(RegisterExceptionHandler::class.java)
    override fun handle(request: HttpRequest<*>?, exception: RegisterException?): HttpResponse<*> {
        val registerError = RegisterError(
            HttpStatus.BAD_REQUEST.toString(), 400, "invalid arguments"
        )
        LOG.error("Register Exception")
        return HttpResponse.badRequest(registerError)

    }
}