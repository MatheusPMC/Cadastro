package com.register.infra.repository.impl

import com.datastax.oss.driver.api.core.CqlIdentifier
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.BoundStatement
import com.datastax.oss.driver.api.core.cql.PreparedStatement
import com.datastax.oss.driver.api.core.cql.Row
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import com.register.core.domain.Register
import com.register.infra.entity.RegisterEntity
import com.register.infra.exception.RegisterAlreadyExistsException
import com.register.infra.nats.RegisterClient
import com.register.infra.repository.RegisterEntityRepository
import javax.inject.Singleton

@Singleton
class RegisterEntityRepositoryImpl(private val cqlSession: CqlSession, private val registerClient: RegisterClient): RegisterEntityRepository {

    override fun findAllAddress(): List<RegisterEntity> {
        val selectResult = cqlSession.execute(
            SimpleStatement.newInstance("SELECT * FROM register")
        )
        return selectResult.map { register ->
            RegisterEntity(register.getUuid("id")!!, register.getString("name")!!,
                register.getInt("age"), register.getString("cpf")!!,
                register.getString("email")!!, register.getString("phone")!!)}.toList()
    }

    override fun findAddressByCpf(cpf: String): Register? {
        val selectResult: Row? = cqlSession.execute(
            "SELECT id, name, age, cpf, email, phone FROM register WHERE cpf= ?", cpf).one()
        val entity: Register?
        (if (selectResult == null) {
            return null
        } else {
            val id = selectResult.getUuid(CqlIdentifier.fromCql("id"))!!
            val name = selectResult.getString(CqlIdentifier.fromCql("name"))!!
            val age = selectResult.getInt(CqlIdentifier.fromCql("age"))
            val email = selectResult.getString(CqlIdentifier.fromCql("email"))!!
            val phone = selectResult.getString(CqlIdentifier.fromCql("phone"))!!
            entity = Register(id, name, age, cpf, email, phone)
        })
        return entity
    }

    override fun registerSave(registerEntity: RegisterEntity): RegisterEntity {
        val preparedInsert: PreparedStatement = cqlSession.prepare(
            "INSERT INTO register(id, name, age, cpf, email, phone) VALUES (?,?,?,?,?,?) IF NOT EXISTS"
        )
        val insert: BoundStatement = preparedInsert.bind(registerEntity.id!!,registerEntity.name,registerEntity.age,
        registerEntity.cpf,registerEntity.email,registerEntity.phone)
        val result = cqlSession.execute(insert)
        registerClient.registerSave(registerEntity)

        if (!result.wasApplied()) {
            throw RegisterAlreadyExistsException("Cliente já registrado!")
        }
        return registerEntity
    }

    override fun registerUploaded(registerEntity: RegisterEntity): RegisterEntity {
        val preparedInsert: PreparedStatement = cqlSession.prepare(
                "UPDATE register SET id = ?,  name = ?, age = ?, email = ?, phone = ? WHERE cpf = ? IF EXISTS"
        )
        val update : BoundStatement = preparedInsert.bind(
                registerEntity.id!!,
                registerEntity.name,
                registerEntity.age,
                registerEntity.email,
                registerEntity.phone,
                registerEntity.cpf
            )
        val rs = cqlSession.execute(update)
        if (!rs.wasApplied()){
            throw RegisterAlreadyExistsException("Esse Cliente não existe!")
        }
        return registerEntity
    }

    override fun deleteCql(cpf: String) {
        cqlSession.execute(
            SimpleStatement.newInstance(
                "DELETE FROM register WHERE cpf = ? IF EXISTS", cpf
            )
        )
    }
}