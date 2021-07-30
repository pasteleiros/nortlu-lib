package io.github.pasteleiros.nortlulib.enum

import io.github.pasteleiros.nortlulib.exception.ValidacaoException

enum class StatusPedido  (val id: Int, val descricao: String) {
    SOLICITADO(1, "Solicitado"),
    RECEBIDO(2,"Recebido"),
    EM_PREPARO(3, "Em preparo"),
    CONCLUIDO(4, "Concluido"),
    A_CAMINHO(5, "A caminho"),
    ENTREGUE(6, "Entregue"),
    CANCELADO(7, "Cancelado");

    companion object {
        fun parse(codigo: Int) = values().filter { it.id == codigo }
            .ifEmpty { throw ValidacaoException("Erro ao tentar converter codigo $codigo em enum de FormaPagamento") }
            .single()
    }
}