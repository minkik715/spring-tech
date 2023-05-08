package io.github.minkik715.springtech.entity.repository.impl

import io.github.minkik715.springtech.entity.domain.ProductOrder
import io.github.minkik715.springtech.entity.repository.`interface`.ProductOrderRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductOrderJpaRepository : JpaRepository<ProductOrder, Long>, ProductOrderRepository