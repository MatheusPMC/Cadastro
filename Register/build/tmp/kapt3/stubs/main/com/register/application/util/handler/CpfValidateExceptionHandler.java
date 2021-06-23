package com.register.application.util.handler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/register/application/util/handler/CpfValidateExceptionHandler;", "Lio/micronaut/http/server/exceptions/ExceptionHandler;", "Lcom/register/application/util/handler/exception/CpfValidateException;", "Lio/micronaut/http/HttpResponse;", "()V", "handle", "request", "Lio/micronaut/http/HttpRequest;", "exception", "Register"})
@io.micronaut.context.annotation.Requires(classes = {com.register.application.util.handler.exception.CpfValidateException.class, io.micronaut.http.server.exceptions.ExceptionHandler.class})
@io.micronaut.http.annotation.Produces()
@javax.inject.Singleton()
public final class CpfValidateExceptionHandler implements io.micronaut.http.server.exceptions.ExceptionHandler<com.register.application.util.handler.exception.CpfValidateException, io.micronaut.http.HttpResponse<?>> {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.micronaut.http.HttpResponse<?> handle(@org.jetbrains.annotations.Nullable()
    io.micronaut.http.HttpRequest<?> request, @org.jetbrains.annotations.Nullable()
    com.register.application.util.handler.exception.CpfValidateException exception) {
        return null;
    }
    
    public CpfValidateExceptionHandler() {
        super();
    }
}