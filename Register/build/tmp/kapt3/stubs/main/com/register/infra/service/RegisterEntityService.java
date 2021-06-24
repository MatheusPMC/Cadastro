package com.register.infra.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/register/infra/service/RegisterEntityService;", "Lcom/register/core/port/RegisterRepositoryPort;", "registerEntityRepository", "Lcom/register/infra/repository/RegisterEntityRepository;", "(Lcom/register/infra/repository/RegisterEntityRepository;)V", "registerAdd", "Lcom/register/core/domain/Register;", "registerEntity", "Lcom/register/infra/entity/RegisterEntity;", "registerUpdate", "Register"})
@javax.inject.Singleton()
public final class RegisterEntityService implements com.register.core.port.RegisterRepositoryPort {
    private final com.register.infra.repository.RegisterEntityRepository registerEntityRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.register.core.domain.Register registerAdd(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.register.core.domain.Register registerUpdate(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity) {
        return null;
    }
    
    public RegisterEntityService(@org.jetbrains.annotations.NotNull()
    com.register.infra.repository.RegisterEntityRepository registerEntityRepository) {
        super();
    }
}