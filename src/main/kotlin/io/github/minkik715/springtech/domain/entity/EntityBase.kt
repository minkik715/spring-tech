package io.github.minkik715.springtech.domain.entity

import org.hibernate.annotations.GenericGenerator
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*
import javax.persistence.*

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class EntityBase {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(columnDefinition = "BINARY(16)")
    val id : String = UUID.randomUUID().toString()

    @CreatedDate
    @Column(name="created_at")
    lateinit var createdAt: Date

    @LastModifiedDate
    @Column(name="updated_at")
    lateinit var updatedAt: Date

    @Column
    var deleted :Boolean =false
}