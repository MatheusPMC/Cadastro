package com.register.application.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\u0016\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0018\u00010\rH\u0017J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0017J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/register/application/controller/RegisterController;", "", "registerService", "Lcom/register/core/port/RegisterServicePort;", "(Lcom/register/core/port/RegisterServicePort;)V", "create", "Lio/micronaut/http/HttpResponse;", "registerDto", "Lcom/register/application/dto/RegisterDto;", "delete", "cpf", "", "getAll", "Lio/micronaut/http/MutableHttpResponse;", "", "getGetCpf", "update", "Register"})
@io.micronaut.http.annotation.Controller(value = "register")
@io.micronaut.validation.Validated()
public class RegisterController {
    private final com.register.core.port.RegisterServicePort registerService = null;
    
    @org.jetbrains.annotations.Nullable()
    @io.micronaut.http.annotation.Get()
    public io.micronaut.http.MutableHttpResponse<java.util.List<com.register.application.dto.RegisterDto>> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{cpf}")
    public io.micronaut.http.HttpResponse<java.lang.Object> getGetCpf(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String cpf) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post()
    public io.micronaut.http.HttpResponse<java.lang.Object> create(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    com.register.application.dto.RegisterDto registerDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "/{cpf}")
    public io.micronaut.http.HttpResponse<java.lang.Object> update(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String cpf, @org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    com.register.application.dto.RegisterDto registerDto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Delete(value = "/{cpf}")
    public io.micronaut.http.HttpResponse<java.lang.Object> delete(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.PathVariable()
    java.lang.String cpf) {
        return null;
    }
    
    public RegisterController(@org.jetbrains.annotations.NotNull()
    com.register.core.port.RegisterServicePort registerService) {
        super();
    }
}