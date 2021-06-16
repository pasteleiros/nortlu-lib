package com.github.pasteleiros.nortlulib.entity

import javax.persistence.*

@Entity(name = "categoria")
data class CategoriaEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
       val descricao: String):BaseEntity()