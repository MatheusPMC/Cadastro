package com.register.application.controller.handler.cpfException

import com.register.application.controller.handler.registerException.RegisterExceptionHandler
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
@Requires(classes = [CpfValidateException::class, ExceptionHandler::class])
class CpfValidateExceptionHandler: ExceptionHandler<CpfValidateException?, HttpResponse<*>> {

    val LOG: Logger = LoggerFactory.getLogger(RegisterExceptionHandler::class.java)

    override fun handle(request: HttpRequest<*>?, exception: CpfValidateException?): HttpResponse<*> {
        val customerError = CustomerError(
            HttpStatus.BAD_REQUEST.toString(),
            400, "Este cpf é invalido!")
        LOG.error("Cpf Exception")
        return HttpResponse.badRequest(customerError)
    }
}