package io.github.minkik715.springtech.entity.repository.impl

import io.github.minkik715.springtech.entity.domain.User
import io.github.minkik715.springtech.entity.repository.`interface`.UserRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserJpaRepository : JpaRepository<User, Long>, UserRepository