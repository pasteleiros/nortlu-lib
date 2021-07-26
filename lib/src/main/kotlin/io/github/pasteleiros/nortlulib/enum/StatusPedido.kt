package io.github.pasteleiros.nortlulib.enum

enum class StatusPedido  (val id: Long, val descricao: String) {
    SOLICITADO(1, "Solicitado"),
    RECEBIDO(2,"Recebido"),
    EM_PREPARO(3, "Em preparo"),
    CONCLUIDO(4, "Concluido"),
    A_CAMINHO(5, "A caminho"),
    ENTREGUE(6, "Entregue"),
    CANCELADO(7, "Cancelado")
}