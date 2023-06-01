package io.github.minkik715.springtech.service.impl

import io.github.minkik715.springtech.domain.dto.response.UserPageResponseDto
import io.github.minkik715.springtech.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    override fun getUserPage(userId: String): UserPageResponseDto {
        TODO("Not yet implemented")
    }
}