package io.github.pasteleiros.nortlulib.dto

data class UsuarioDto(var id: Long?,
                 val nome: String,
                 val cpf: String,
                 val email: String,
                 val telefone: String,
                 val enderecos: List<EnderecoDto>):BaseDto()