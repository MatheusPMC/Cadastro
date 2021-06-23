package com.register.infra.repository.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/register/infra/repository/impl/RegisterEntityRepositoryImpl;", "Lcom/register/infra/repository/RegisterEntityRepository;", "cqlSession", "Lcom/datastax/oss/driver/api/core/CqlSession;", "registerClient", "Lcom/register/infra/nats/RegisterClient;", "(Lcom/datastax/oss/driver/api/core/CqlSession;Lcom/register/infra/nats/RegisterClient;)V", "deleteCql", "", "cpf", "", "findAddressByCpf", "Lcom/register/core/domain/Register;", "findAllAddress", "", "Lcom/register/infra/entity/RegisterEntity;", "registerSave", "registerEntity", "registerUploaded", "Register"})
@javax.inject.Singleton()
public final class RegisterEntityRepositoryImpl implements com.register.infra.repository.RegisterEntityRepository {
    private final com.datastax.oss.driver.api.core.CqlSession cqlSession = null;
    private final com.register.infra.nats.RegisterClient registerClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.register.infra.entity.RegisterEntity> findAllAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.register.core.domain.Register findAddressByCpf(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf) {
        return null;
    }
    
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
    
    @java.lang.Override()
    public void deleteCql(@org.jetbrains.annotations.NotNull()
    java.lang.String cpf) {
    }
    
    public RegisterEntityRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.datastax.oss.driver.api.core.CqlSession cqlSession, @org.jetbrains.annotations.NotNull()
    com.register.infra.nats.RegisterClient registerClient) {
        super();
    }
}