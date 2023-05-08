package io.github.minkik715.springtech.entity.domain

import io.github.minkik715.springtech.entity.enum.Role
import javax.persistence.*

@Entity
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column
    val name: String,

    @Column
    val password: String,

    @Column
    @Enumerated(EnumType.STRING)
    val role: Role,

    @Column
    @OneToMany(fetch = FetchType.LAZY)
    val products: MutableList<Product>,

    @Column
    @OneToMany(fetch = FetchType.LAZY)
    val orders: MutableList<Order>
)
