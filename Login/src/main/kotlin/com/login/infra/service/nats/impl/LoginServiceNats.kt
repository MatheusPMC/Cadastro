package com.login.infra.service.nats.impl

import com.login.infra.entity.AddressEntity
import com.login.infra.entity.LoginEntity
import com.login.infra.entity.RegisterEntity
import com.login.infra.repository.nats.NatsEntityRepository
import com.login.infra.service.nats.LoginEntityServiceNats
import javax.inject.Singleton

@Singleton
class LoginServiceNats(private val natsRepository: NatsEntityRepository): LoginEntityServiceNats {
    override fun createRegister(registerEntity: RegisterEntity) {
        natsRepository.addRegister(LoginEntity(registerEntity.id,registerEntity.name,registerEntity.age,
            registerEntity.cpf,registerEntity.email,registerEntity.phone,"",null,"","",""))
    }

    override fun createAddress(addressEntity: AddressEntity) {
        natsRepository.addAddress(LoginEntity(addressEntity.id,"",null, "","","",
            addressEntity.street,addressEntity.number,addressEntity.city,addressEntity.state,addressEntity.postalCode))
    }
}