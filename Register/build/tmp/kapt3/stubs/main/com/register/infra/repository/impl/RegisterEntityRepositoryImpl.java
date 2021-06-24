package com.register.infra.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/register/infra/repository/impl/RegisterEntityRepositoryImpl;", "Lcom/register/infra/repository/RegisterEntityRepository;", "registerClient", "Lcom/register/infra/nats/RegisterClient;", "(Lcom/register/infra/nats/RegisterClient;)V", "registerSave", "Lcom/register/infra/entity/RegisterEntity;", "registerEntity", "registerUploaded", "Register"})
@javax.inject.Singleton()
public final class RegisterEntityRepositoryImpl implements com.register.infra.repository.RegisterEntityRepository {
    private final com.register.infra.nats.RegisterClient registerClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.register.infra.entity.RegisterEntity registerSave(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.register.infra.entity.RegisterEntity registerUploaded(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity) {
        return null;
    }
    
    public RegisterEntityRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.register.infra.nats.RegisterClient registerClient) {
        super();
    }
}