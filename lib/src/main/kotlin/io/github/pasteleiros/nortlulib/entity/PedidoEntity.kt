package io.github.pasteleiros.nortlulib.entity

import io.github.pasteleiros.nortlulib.enum.FormaPagamento
import io.github.pasteleiros.nortlulib.enum.StatusPedido
import java.math.BigDecimal
import javax.persistence.*

@Entity(name = "pedido")
data class PedidoEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,

    @OneToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id" )
    val usuario: UsuarioEntity,

    @Column(name = "id_forma_pagamento")
    val idFormaPagamento: Int,

    @Column(name = "id_status")
    val idStatus: Int,

    @Column(name = "valor_total")
    val valorTotal: BigDecimal,

    @ManyToMany(mappedBy = "itensPedido")
    val produtos: List<ProdutoEntity> = listOf()
):BaseEntity() {
    constructor() : this(
        id = null,
        usuario = UsuarioEntity(),
        idFormaPagamento = FormaPagamento.DEBITO.id,
        idStatus = StatusPedido.SOLICITADO.id,
        valorTotal = BigDecimal.ZERO
    )
}