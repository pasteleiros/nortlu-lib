package com.github.pasteleiros.nortlulib.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "usuario")
data class UsuarioEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
        val nome: String,
        val cpf: String,
        val email: String,
        val telefone: String,
        val enderecos: List<EnderecoEntity>):BaseEntity()