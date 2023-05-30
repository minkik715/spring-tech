package io.github.minkik715.springtech.domain.repository.impl

import io.github.minkik715.springtech.domain.entity.User
import io.github.minkik715.springtech.domain.repository.UserRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserJpaRepository : JpaRepository<User, Long>, UserRepository