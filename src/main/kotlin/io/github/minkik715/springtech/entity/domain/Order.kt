package io.github.minkik715.springtech.entity.domain

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
data class Order(
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(columnDefinition = "BINARY(16)")
    val id : String,

    @JoinColumn(name ="user_id")
    @ManyToOne
    val user: User,


    @OneToMany
    val productOrder: MutableList<ProductOrder>,

)