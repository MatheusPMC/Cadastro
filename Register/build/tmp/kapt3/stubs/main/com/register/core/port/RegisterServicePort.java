package com.register.core.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lcom/register/core/port/RegisterServicePort;", "", "createRegister", "Lcom/register/application/dto/RegisterDto;", "register", "Lcom/register/core/domain/Register;", "delete", "", "cpf", "", "findByCpf", "findRegistersList", "", "registerUpdate", "Register"})
@javax.inject.Singleton()
public abstract interface RegisterServicePort {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.register.core.domain.Register findByCpf(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.register.core.domain.Register> findRegistersList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.application.dto.RegisterDto createRegister(@org.jetbrains.annotations.NotNull()
    com.register.core.domain.Register register);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.application.dto.RegisterDto registerUpdate(@org.jetbrains.annotations.NotNull()
    com.register.core.domain.Register register);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf);
}