package io.github.pasteleiros.nortlulib.entity

import javax.persistence.*

@Entity(name = "categoria")
data class CategoriaEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long?,
       val descricao: String):BaseEntity() {
           constructor() : this(id = null, descricao = "default")
       }