package com.nortlu.dto

data class UsuarioDto(val id: Long?,
                 val nome: String,
                 val cpf: String,
                 val email: String,
                 val telefone: String,
                 val enderecos: List<EnderecoDto>)