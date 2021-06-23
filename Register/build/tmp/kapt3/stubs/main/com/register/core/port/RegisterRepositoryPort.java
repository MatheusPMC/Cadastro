package com.register.core.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH&\u00a8\u0006\u000e"}, d2 = {"Lcom/register/core/port/RegisterRepositoryPort;", "", "delete", "", "cpf", "", "findAllRegister", "", "Lcom/register/infra/entity/RegisterEntity;", "findRegisterByCpf", "Lcom/register/core/domain/Register;", "registerAdd", "registerEntity", "registerUpdate", "Register"})
@javax.inject.Singleton()
public abstract interface RegisterRepositoryPort {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.register.core.domain.Register findRegisterByCpf(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.register.infra.entity.RegisterEntity> findAllRegister();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.core.domain.Register registerAdd(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.core.domain.Register registerUpdate(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf);
}