package com.nortlu.dto

data class EnderecoDto(
        val id: Long?,
        val logradouro: String,
        val numero: Int,
        val complemento: String = "",
        val bairro: String,
        val cidade: String,
        val cep: String,
        val observacao: String = ""
)