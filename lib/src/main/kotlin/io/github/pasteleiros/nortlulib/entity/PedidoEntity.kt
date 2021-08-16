package io.github.pasteleiros.nortlulib.entity

import io.github.pasteleiros.nortlulib.enum.FormaPagamento
import io.github.pasteleiros.nortlulib.enum.StatusPedido
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import java.math.BigDecimal
import javax.persistence.*

@Entity(name = "pedido")
data class PedidoEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_usuario", referencedColumnName = "id" )
    val usuario: UsuarioEntity,

    @Column(name = "id_forma_pagamento")
    val idFormaPagamento: Int,

    @Column(name = "id_status")
    val idStatus: Int,

    @Column(name = "valor_total")
    val valorTotal: BigDecimal,

    @ManyToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    @JoinTable(name = "itens_pedidos",
        joinColumns = [JoinColumn(name = "id_produto", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "id_pedido", referencedColumnName = "id")])
    var itens : List<ProdutoEntity> = listOf()

):BaseEntity() {
            constructor() : this(
                id = null,
                usuario = UsuarioEntity(),
                idFormaPagamento = FormaPagamento.DEBITO.id,
                idStatus = StatusPedido.SOLICITADO.id,
                valorTotal = BigDecimal.ZERO
            )
        }