package com.register.infra.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/register/infra/repository/RegisterEntityRepository;", "", "registerSave", "Lcom/register/infra/entity/RegisterEntity;", "registerEntity", "registerUploaded", "Register"})
@javax.inject.Singleton()
public abstract interface RegisterEntityRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.infra.entity.RegisterEntity registerSave(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.infra.entity.RegisterEntity registerUploaded(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity);
}