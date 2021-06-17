package io.github.pasteleiros.nortlulib.enum

enum class FormaPagamento (val id: Long, val descricao: String) {
    CREDITO(1, "Crédito"),
    DEBITO(2, "Débito"),
    REFEICAO(3, "Refeição"),
    DINHEIRO(4, "Dinheiro"),
    PIX(5, "PIX")
}
