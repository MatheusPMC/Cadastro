package com.register.infra.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH&\u00a8\u0006\u000e"}, d2 = {"Lcom/register/infra/repository/RegisterEntityRepository;", "", "deleteCql", "", "cpf", "", "findAddressByCpf", "Lcom/register/core/domain/Register;", "findAllAddress", "", "Lcom/register/infra/entity/RegisterEntity;", "registerSave", "registerEntity", "registerUploaded", "Register"})
@javax.inject.Singleton()
public abstract interface RegisterEntityRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.register.core.domain.Register findAddressByCpf(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.register.infra.entity.RegisterEntity> findAllAddress();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.infra.entity.RegisterEntity registerSave(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.register.infra.entity.RegisterEntity registerUploaded(@org.jetbrains.annotations.NotNull()
    com.register.infra.entity.RegisterEntity registerEntity);
    
    public abstract void deleteCql(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf);
}