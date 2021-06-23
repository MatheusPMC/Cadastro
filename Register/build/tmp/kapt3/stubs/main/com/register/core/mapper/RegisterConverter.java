package com.register.core.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/register/core/mapper/RegisterConverter;", "", "()V", "Companion", "Register"})
public final class RegisterConverter {
    @org.jetbrains.annotations.NotNull()
    public static final com.register.core.mapper.RegisterConverter.Companion Companion = null;
    
    public RegisterConverter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004J\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004\u00a8\u0006\u0013"}, d2 = {"Lcom/register/core/mapper/RegisterConverter$Companion;", "", "()V", "registerDtoToRegister", "Lcom/register/core/domain/Register;", "registerDto", "Lcom/register/application/dto/RegisterDto;", "registerEntityToRegister", "registerEntity", "Lcom/register/infra/entity/RegisterEntity;", "registerEntityToRegisterList", "", "registerEntityList", "", "registerToRegisterDto", "register", "registerToRegisterDtoList", "registerList", "registerToRegisterEntity", "Register"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.register.core.domain.Register registerDtoToRegister(@org.jetbrains.annotations.NotNull()
        com.register.application.dto.RegisterDto registerDto) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.register.application.dto.RegisterDto registerToRegisterDto(@org.jetbrains.annotations.NotNull()
        com.register.core.domain.Register register) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.register.infra.entity.RegisterEntity registerToRegisterEntity(@org.jetbrains.annotations.NotNull()
        com.register.core.domain.Register register) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.register.core.domain.Register registerEntityToRegister(@org.jetbrains.annotations.NotNull()
        com.register.infra.entity.RegisterEntity registerEntity) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.register.application.dto.RegisterDto> registerToRegisterDtoList(@org.jetbrains.annotations.NotNull()
        java.util.List<com.register.core.domain.Register> registerList) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.register.core.domain.Register> registerEntityToRegisterList(@org.jetbrains.annotations.NotNull()
        java.util.List<com.register.infra.entity.RegisterEntity> registerEntityList) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}