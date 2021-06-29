package com.login.infra.repository.impl

import com.datastax.oss.driver.api.core.CqlIdentifier
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.Row
import com.login.infra.entity.LoginEntity
import com.login.infra.exception.LoginException
import com.login.infra.repository.LoginEntityRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class LoginEntityRepositoryImpl(private val session: CqlSession) : LoginEntityRepository {
    override fun findAddressById(id: UUID): LoginEntity? {
        val selectResult: Row? = session.execute(
            "SELECT name, age, cpf, email, phone, street, number, city, state, postalCode " +
                    "FROM Login WHERE id= ?", id).one()
        val entity: LoginEntity?
        (if (selectResult == null) {
            throw LoginException()
        } else {
            val name = selectResult.getString(CqlIdentifier.fromCql("name"))!!
            val age = selectResult.getInt(CqlIdentifier.fromCql("age"))
            val cpf = selectResult.getString(CqlIdentifier.fromCql("cpf"))!!
            val email = selectResult.getString(CqlIdentifier.fromCql("email"))!!
            val phone = selectResult.getString(CqlIdentifier.fromCql("phone"))!!
            val street = selectResult.getString(CqlIdentifier.fromCql("street"))!!
            val number = selectResult.getInt(CqlIdentifier.fromCql("number"))
            val city = selectResult.getString(CqlIdentifier.fromCql("city"))!!
            val state = selectResult.getString(CqlIdentifier.fromCql("state"))!!
            val postalCode = selectResult.getString(CqlIdentifier.fromCql("postalCode"))!!

            entity = LoginEntity(id, name, age, cpf, email, phone, street, number, city, state, postalCode)
        })
        return entity
    }
}