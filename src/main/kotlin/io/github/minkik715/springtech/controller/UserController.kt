package io.github.minkik715.springtech.controller

import io.github.minkik715.springtech.domain.dto.response.UserPageResponseDto
import io.github.minkik715.springtech.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/api/user")
class UserController(
    private val userService: UserService
) {
    @GetMapping("/{userId}")
    fun getUserPage(userId: String): UserPageResponseDto {
        return userService.getUserPage(userId)
    }
}