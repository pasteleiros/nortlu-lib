package io.github.pasteleiros.nortlulib.enum

import io.github.pasteleiros.nortlulib.exception.ValidacaoException

enum class FormaPagamento(val id: Int, val descricao: String) {
    CREDITO(1, "Crédito"),
    DEBITO(2, "Débito"),
    REFEICAO(3, "Refeição"),
    DINHEIRO(4, "Dinheiro"),
    PIX(5, "PIX");

    companion object {
        fun parse(codigo: Int) = values().filter { it.id == codigo }
            .ifEmpty { throw ValidacaoException("Erro ao tentar converter codigo $codigo em enum de FormaPagamento") }
            .single()
    }
}
