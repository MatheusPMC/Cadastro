package com.register.infra.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/register/infra/service/RegisterEntityService;", "Lcom/register/core/port/RegisterRepositoryPort;", "registerEntityRepository", "Lcom/register/infra/repository/RegisterEntityRepository;", "(Lcom/register/infra/repository/RegisterEntityRepository;)V", "delete", "", "cpf", "", "findAllRegister", "", "Lcom/register/infra/entity/RegisterEntity;", "findRegisterByCpf", "Lcom/register/core/domain/Register;", "registerAdd", "registerEntity", "registerUpdate", "Register"})
@javax.inject.Singleton()
public final class RegisterEntityService implements com.register.core.port.RegisterRepositoryPort {
    private final com.register.infra.repository.RegisterEntityRepository registerEntityRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.register.core.domain.Register findRegisterByCpf(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.register.infra.entity.RegisterEntity> findAllRegister() {
        return null;
    }
    
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
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf) {
    }
    
    public RegisterEntityService(@org.jetbrains.annotations.NotNull()
    com.register.infra.repository.RegisterEntityRepository registerEntityRepository) {
        super();
    }
}