package com.register.application.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003JG\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f\u00a8\u0006$"}, d2 = {"Lcom/register/application/dto/RegisterDto;", "", "id", "Ljava/util/UUID;", "name", "", "age", "", "cpf", "email", "phone", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAge", "()Ljava/lang/Number;", "getCpf", "()Ljava/lang/String;", "getEmail", "getId", "()Ljava/util/UUID;", "setId", "(Ljava/util/UUID;)V", "getName", "getPhone", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Register"})
@io.micronaut.core.annotation.Introspected()
public final class RegisterDto {
    @org.jetbrains.annotations.Nullable()
    private java.util.UUID id;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 255)
    @javax.validation.constraints.NotBlank(message = "Campo obrigat\u00f3rio")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Positive(message = "Campo obrigat\u00f3rio")
    private final java.lang.Number age = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 14)
    @javax.validation.constraints.NotBlank(message = "Campo obrigat\u00f3rio")
    private final java.lang.String cpf = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(max = 255)
    @javax.validation.constraints.Email()
    @javax.validation.constraints.NotBlank(message = "Campo obrigat\u00f3rio")
    private final java.lang.String email = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.Size(min = 11, max = 14)
    @javax.validation.constraints.NotBlank(message = "Campo obrigat\u00f3rio")
    private final java.lang.String phone = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.UUID getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number getAge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCpf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public RegisterDto(@org.jetbrains.annotations.Nullable()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Number age, @org.jetbrains.annotations.NotNull()
    java.lang.String cpf, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        super();
    }
    
    public RegisterDto() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.register.application.dto.RegisterDto copy(@org.jetbrains.annotations.Nullable()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Number age, @org.jetbrains.annotations.NotNull()
    java.lang.String cpf, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}