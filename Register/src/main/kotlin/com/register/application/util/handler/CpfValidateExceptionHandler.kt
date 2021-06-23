package com.register.application.util.handler

import com.register.application.util.handler.exception.CpfValidateException
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import javax.inject.Singleton

@Singleton
@Produces
@Requires(classes = [CpfValidateException::class, ExceptionHandler::class])
class CpfValidateExceptionHandler: ExceptionHandler<CpfValidateException?, HttpResponse<*>> {

    override fun handle(request: HttpRequest<*>?, exception: CpfValidateException?): HttpResponse<*> {
        val customerError = CustomerError(
            HttpStatus.BAD_REQUEST.toString(),
            400, "Este cpf é invalido!")
        return HttpResponse.badRequest(customerError)
    }
}