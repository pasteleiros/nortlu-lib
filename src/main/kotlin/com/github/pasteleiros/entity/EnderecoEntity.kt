package com.github.pasteleiros.nortlulib.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "endereco")
data class EnderecoEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
        val logradouro: String,
        val numero: Int,
        val complemento: String = "",
        val bairro: String,
        val cidade: String,
        val cep: String,
        val observacao: String = ""
):BaseEntity()