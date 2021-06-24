package com.address.application.controller.handler

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
@Requires(classes = [AddressException::class, ExceptionHandler::class])
class AddressExceptionHandler : ExceptionHandler<AddressException?, HttpResponse<*>> {

    val LOG: Logger = LoggerFactory.getLogger(AddressExceptionHandler::class.java)
    override fun handle(request: HttpRequest<*>?, exception: AddressException?): HttpResponse<*> {
        val registerError = AddressError(
            HttpStatus.BAD_REQUEST.toString(), 400, "invalid arguments"
        )
        LOG.error("Address Exception")
        return HttpResponse.badRequest(registerError)

    }
}