package io.github.minkik715.springtech.entity.domain

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
data class Product(

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(columnDefinition = "BINARY(16)")
    val id: String,

    @Column
    var name: String,

    @Column
    val price: Long,

    @Column
    val quantity: Long,

    @JoinColumn(name = "owner_id")
    @ManyToOne(fetch = FetchType.LAZY)
    val owner: User,

    @OneToMany
    val productOrder: MutableList<ProductOrder>,

    )