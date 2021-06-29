package com.register.infra.exception


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
@Requires(classes = [RegisterExceptionImpl::class, ExceptionHandler::class])
class RegisterExceptionImplHandler : ExceptionHandler<RegisterExceptionImpl?, HttpResponse<*>> {

    val LOG: Logger = LoggerFactory.getLogger(RegisterExceptionImplHandler::class.java)
    override fun handle(request: HttpRequest<*>?, exception: RegisterExceptionImpl?): HttpResponse<*> {
        val registerError = RegisterErrorImpl(
            HttpStatus.BAD_REQUEST.toString(), 400, "Dados incorretos, tente novamente!"
        )
        LOG.error("Register Exception")
        return HttpResponse.badRequest(registerError)

    }
}