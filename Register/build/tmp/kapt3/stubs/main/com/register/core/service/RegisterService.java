package com.register.core.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/register/core/service/RegisterService;", "Lcom/register/core/port/RegisterServicePort;", "registerRepository", "Lcom/register/core/port/RegisterRepositoryPort;", "registerClient", "Lcom/register/infra/nats/RegisterClient;", "(Lcom/register/core/port/RegisterRepositoryPort;Lcom/register/infra/nats/RegisterClient;)V", "createRegister", "Lcom/register/application/dto/RegisterDto;", "register", "Lcom/register/core/domain/Register;", "delete", "", "cpf", "", "findByCpf", "findRegistersList", "", "registerUpdate", "Register"})
@javax.inject.Singleton()
public final class RegisterService implements com.register.core.port.RegisterServicePort {
    private final com.register.core.port.RegisterRepositoryPort registerRepository = null;
    private final com.register.infra.nats.RegisterClient registerClient = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.register.core.domain.Register findByCpf(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.register.core.domain.Register> findRegistersList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.register.application.dto.RegisterDto createRegister(@org.jetbrains.annotations.NotNull()
    com.register.core.domain.Register register) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.register.application.dto.RegisterDto registerUpdate(@org.jetbrains.annotations.NotNull()
    com.register.core.domain.Register register) {
        return null;
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf) {
    }
    
    public RegisterService(@org.jetbrains.annotations.NotNull()
    com.register.core.port.RegisterRepositoryPort registerRepository, @org.jetbrains.annotations.NotNull()
    com.register.infra.nats.RegisterClient registerClient) {
        super();
    }
}