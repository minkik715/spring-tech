package io.github.minkik715.springtech.entity.repository.impl

import io.github.minkik715.springtech.entity.domain.Product
import io.github.minkik715.springtech.entity.repository.`interface`.ProductRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductJpaRepository : JpaRepository<Product, String>, ProductRepository