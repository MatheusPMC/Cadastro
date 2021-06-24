package com.register.application.util

import com.register.application.dto.RegisterDto
import com.register.application.controller.handler.registerException.RegisterException

class RegisterUtil {
    companion object{
        fun isValid(registerDto: RegisterDto): RegisterDto {

            if (registerDto.id == null) {
                throw RegisterException()
            }
            return registerDto
        }
    }
}