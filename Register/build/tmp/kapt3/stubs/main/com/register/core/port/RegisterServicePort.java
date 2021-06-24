package com.register.core.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/register/core/port/RegisterServicePort;", "", "createRegister", "Lcom/register/application/dto/RegisterDto;", "register", "Lcom/register/core/domain/Register;", "registerUpdate", "Register"})
@javax.inject.Singleton()
public abstract interface RegisterServicePort {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.application.dto.RegisterDto createRegister(@org.jetbrains.annotations.NotNull()
    com.register.core.domain.Register register);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.application.dto.RegisterDto registerUpdate(@org.jetbrains.annotations.NotNull()
    com.register.core.domain.Register register);
}