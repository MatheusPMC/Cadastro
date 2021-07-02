package com.login.core.mapper

import com.login.application.dto.LoginDto
import com.login.core.domain.Login
import com.login.infra.entity.LoginEntity
import javax.inject.Singleton

@Singleton
class LoginConverter {
    companion object {
        fun loginEntityToLogin(loginEntity: LoginEntity) =
            Login(
                loginEntity.id,
                loginEntity.name!!,
                loginEntity.age,
                loginEntity.cpf!!,
                loginEntity.email!!,
                loginEntity.phone!!,
                loginEntity.street!!,
                loginEntity.number!!,
                loginEntity.city!!,
                loginEntity.state!!,
                loginEntity.postalCode!!
            )


        fun loginToLoginDto(login: Login) =
            LoginDto(
                login.id, login.name, login.age!!, login.cpf, login.email, login.phone,
                login.street, login.number!!, login.city, login.state, login.postalCode
            )
    }
}