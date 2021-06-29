package com.login.infra.exception

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
@Requires(classes = [LoginException::class, ExceptionHandler::class])
class LoginExceptionHandler : ExceptionHandler<LoginException?, HttpResponse<*>> {

    val LOG: Logger = LoggerFactory.getLogger(LoginExceptionHandler::class.java)
    override fun handle(request: HttpRequest<*>?, exception: LoginException?): HttpResponse<*> {
        val addressError = LoginError(
            HttpStatus.BAD_REQUEST.toString(), 400, "Id Invalido!"
        )
        LOG.error("Login Exception")
        return HttpResponse.badRequest(addressError)

    }
}