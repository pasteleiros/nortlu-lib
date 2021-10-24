package io.github.pasteleiros.nortlulib.dto

data class EnderecoDto(
        var id: Long?,
        val logradouro: String,
        val numero: Int,
        val complemento: String?,
        val bairro: String,
        val cidade: String,
        val cep: String,
        val observacao: String?
):BaseDto(){

}