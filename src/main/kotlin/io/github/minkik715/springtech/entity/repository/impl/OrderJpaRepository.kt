package io.github.minkik715.springtech.entity.repository.impl

import io.github.minkik715.springtech.entity.domain.Order
import io.github.minkik715.springtech.entity.repository.`interface`.OrderRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderJpaRepository : JpaRepository<Order, String>, OrderRepository