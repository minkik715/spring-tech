package io.github.minkik715.springtech.domain.repository.impl

import io.github.minkik715.springtech.domain.entity.House
import io.github.minkik715.springtech.domain.repository.HouseRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HouseLikeJpaRepository : JpaRepository<HouseJpaRepository, String>, HouseRepository