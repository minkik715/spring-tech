package io.github.minkik715.springtech.service

import io.github.minkik715.springtech.domain.dto.response.UserPageResponseDto
import org.springframework.stereotype.Service

@Service
interface UserService {
    fun getUserPage(userId: String): UserPageResponseDto
}