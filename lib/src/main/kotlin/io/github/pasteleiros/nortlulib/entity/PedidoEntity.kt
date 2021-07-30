package io.github.pasteleiros.nortlulib.entity

import io.github.pasteleiros.nortlulib.enum.FormaPagamento
import io.github.pasteleiros.nortlulib.enum.StatusPedido
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import java.math.BigDecimal
import javax.persistence.*

@Entity(name = "pedido")
data class PedidoEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
    @OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @Fetch(value = FetchMode.SUBSELECT)
    val items: List<ProdutoEntity>,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_usuario", referencedColumnName = "id" )
    val usuario: UsuarioEntity,

    @Column(name = "id_forma_pagamento")
    val idFormaPagamento: Int,

    @Column(name = "id_status")
    val idStatus: Int,

    @Column(name = "valor_total")
    val valorTotal: BigDecimal
):BaseEntity() {
            constructor() : this(
                id = null,
                items = listOf(),
                usuario = UsuarioEntity(),
                idFormaPagamento = FormaPagamento.DEBITO.id,
                idStatus = StatusPedido.SOLICITADO.id,
                valorTotal = BigDecimal.ZERO
            )
        }