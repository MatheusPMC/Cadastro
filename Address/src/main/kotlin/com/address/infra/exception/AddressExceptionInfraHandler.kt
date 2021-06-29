package com.address.infra.exception

import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Produces(MediaType.APPLICATION_JSON)
@Singleton
@Requires(classes = [AddressExceptionInfra::class, ExceptionHandler::class])
class AddressExceptionInfraHandler : ExceptionHandler<AddressExceptionInfra?, HttpResponse<*>> {

    val LOG: Logger = LoggerFactory.getLogger(AddressExceptionInfraHandler::class.java)
    override fun handle(request: HttpRequest<*>?, exception: AddressExceptionInfra?): HttpResponse<*> {
        val addressError = AddressErrorInfra(
            HttpStatus.BAD_REQUEST.toString(), 400, "Argumentos invalidos!"
        )
        LOG.error("Address Exception")
        return HttpResponse.badRequest(addressError)

    }
}