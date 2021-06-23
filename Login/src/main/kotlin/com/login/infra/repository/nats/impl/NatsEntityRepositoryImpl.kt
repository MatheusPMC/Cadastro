package com.login.infra.repository.nats.impl

import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.BoundStatement
import com.datastax.oss.driver.api.core.cql.PreparedStatement
import com.login.infra.entity.LoginEntity
import com.login.infra.exception.LoginAlreadyExistsException
import com.login.infra.repository.nats.NatsEntityRepository
import javax.inject.Singleton

@Singleton
class NatsEntityRepositoryImpl(private val session: CqlSession) : NatsEntityRepository {
    override fun addRegister(loginEntity: LoginEntity) {
        val preparedInsert: PreparedStatement = session.prepare(
            "INSERT INTO Login(id, name, age, cpf, email, phone," +
                    "street, number, city, state, postalCode) VALUES (?,?,?,?,?,?,?,?,?,?,?) IF NOT EXISTS"
        )
        val insert: BoundStatement = preparedInsert.bind(loginEntity.id,loginEntity.name,loginEntity.age,
            loginEntity.cpf,loginEntity.email,loginEntity.phone,loginEntity.street,loginEntity.number,
            loginEntity.city,loginEntity.state,loginEntity.postalCode)
        val result = session.execute(insert)

        if (!result.wasApplied()) {
            throw LoginAlreadyExistsException("Cliente já registrado!")
        }
    }

    override fun addAddress(loginEntity: LoginEntity) {
        val preparedInsert: PreparedStatement = session.prepare(
            "INSERT INTO Login(id, street, number, city, state, postalCode) VALUES (?,?,?,?,?,?)"
        )
        val insert: BoundStatement = preparedInsert.bind(loginEntity.id,loginEntity.street,loginEntity.number,
            loginEntity.city,loginEntity.state,loginEntity.postalCode)
        val result = session.execute(insert)

        if (!result.wasApplied()) {
            throw LoginAlreadyExistsException("Cliente já registrado!")
        }
    }
}