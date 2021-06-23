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

    override fun uploadedRegister(loginEntity: LoginEntity) {
        val preparedInsert: PreparedStatement = session.prepare(
            "UPDATE Login SET name = ?, age = ?, cpf = ?, email = ?, phone = ? WHERE id = ? IF EXISTS"
        )
        val update : BoundStatement = preparedInsert.bind(
            loginEntity.name,
            loginEntity.age,
            loginEntity.cpf,
            loginEntity.email,
            loginEntity.phone,
            loginEntity.id,
        )
        val rs = session.execute(update)
        if (!rs.wasApplied()){
            throw LoginAlreadyExistsException("Esse Cliente não existe!")
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

    override fun uploadedAddress(loginEntity: LoginEntity) {
        val preparedInsert: PreparedStatement = session.prepare(
            "UPDATE Login SET street = ?, number = ?, city = ?, state = ?, postalCode =? WHERE id = ? IF EXISTS"
        )
        val update : BoundStatement = preparedInsert.bind(

            loginEntity.street,
            loginEntity.number,
            loginEntity.city,
            loginEntity.state,
            loginEntity.postalCode,
            loginEntity.id,
        )
        val rs = session.execute(update)

        if (!rs.wasApplied()){
            throw LoginAlreadyExistsException("Esse Endereço não existe!")
        }
    }
}