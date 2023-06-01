package io.github.minkik715.springtech.domain.entity

import javax.persistence.*

@Entity
data class HouseLike (

    @JoinColumn(name ="user_id")
    @ManyToOne
    val user : User,

    @JoinColumn(name ="house_id")
    @ManyToOne
    val house : House

): EntityBase()
