package io.github.minkik715.springtech.domain.entity

import io.github.minkik715.springtech.domain.enum.Status
import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
data class House (
    @JoinColumn(name ="owner_id")
    @ManyToOne
    val owner: User,

    @JoinColumn(name ="tenant_id")
    @ManyToOne
    val tenant : User?,

    @Column(unique = true)
    val address: String,

    @Column
    val price: Long,

    @Column
    val rent_duration: Long,

    @Column
    @Enumerated(value = EnumType.STRING)
    val status: Status
): EntityBase(){

}