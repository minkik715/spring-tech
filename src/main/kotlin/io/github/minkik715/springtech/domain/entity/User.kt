package io.github.minkik715.springtech.domain.entity

import javax.persistence.*

@Entity
data class User(
    @Column
    val name: String,

    @Column
    val password: String,
) :EntityBase()
