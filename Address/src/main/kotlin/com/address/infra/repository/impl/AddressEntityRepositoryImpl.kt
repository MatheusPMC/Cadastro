package com.address.infra.repository.impl

import com.address.core.domain.Address
import com.address.infra.entity.AddressEntity
import com.address.infra.exception.AddressAlreadyExistsException
import com.address.infra.nats.AddressClient
import com.address.infra.repository.AddressEntityRepository
import com.datastax.oss.driver.api.core.CqlIdentifier
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.BoundStatement
import com.datastax.oss.driver.api.core.cql.PreparedStatement
import com.datastax.oss.driver.api.core.cql.Row
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import java.util.*
import javax.inject.Singleton

@Singleton
class AddressEntityRepositoryImpl(private val cqlSession: CqlSession, private val addressClient: AddressClient): AddressEntityRepository {
    override fun findAddressById(id: UUID): Address? {
        val selectResult: Row? = cqlSession.execute(
            "SELECT street, number, city, state, postalCode FROM Address WHERE id= ?", id).one()
        val entity: Address?
        (if (selectResult == null) {
            return null
        } else {
            val street = selectResult.getString(CqlIdentifier.fromCql("street"))!!
            val number = selectResult.getInt(CqlIdentifier.fromCql("number"))
            val city = selectResult.getString(CqlIdentifier.fromCql("city"))!!
            val state = selectResult.getString(CqlIdentifier.fromCql("state"))!!
            val postalCode = selectResult.getString(CqlIdentifier.fromCql("postalCode"))!!

            entity = Address(id, street, number, city, state, postalCode)
        })
        return entity
    }

    override fun saveAddress(addressEntity: AddressEntity): AddressEntity {
        val preparedInsert: PreparedStatement = cqlSession.prepare(
            "INSERT INTO Address(id, street, number, city, state, postalCode) VALUES (?,?,?,?,?,?) IF NOT EXISTS"
        )
        val insert: BoundStatement = preparedInsert.bind(addressEntity.id, addressEntity.street, addressEntity.number,
            addressEntity.city, addressEntity.state, addressEntity.postalCode
        )
        val rs = cqlSession.execute(insert)
        addressClient.saveAddress(addressEntity)

        if (!rs.wasApplied()) {
            throw AddressAlreadyExistsException("Cliente já registrado!")
        }
        return addressEntity
    }

    override fun uploadedAddress(addressEntity: AddressEntity): AddressEntity {
        val preparedInsert: PreparedStatement = cqlSession.prepare(
            "UPDATE Address SET street = ?, number = ?, city = ?, state = ?, postalCode =? WHERE id = ? IF EXISTS"
        )
        val update : BoundStatement = preparedInsert.bind(

            addressEntity.street,
            addressEntity.number,
            addressEntity.city,
            addressEntity.state,
            addressEntity.postalCode,
            addressEntity.id,
        )
        val rs = cqlSession.execute(update)
        addressClient.updateAddress(addressEntity)

        if (!rs.wasApplied()){
            throw AddressAlreadyExistsException("Esse Endereço não existe!")
        }
        return addressEntity
    }

    override fun deleteCql(id: UUID) {
        cqlSession.execute(
            SimpleStatement.newInstance(
                "DELETE FROM Address WHERE id = ? IF EXISTS", id
            )
        )
    }
}