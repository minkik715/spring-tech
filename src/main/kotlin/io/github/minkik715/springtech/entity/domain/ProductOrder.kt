package io.github.minkik715.springtech.entity.domain

import javax.persistence.*

@Entity
data class ProductOrder(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne
    @JoinColumn(name = "order_id")
    val order: Order,
    @ManyToOne
    @JoinColumn(name = "product_id")
    val product: Product
    )