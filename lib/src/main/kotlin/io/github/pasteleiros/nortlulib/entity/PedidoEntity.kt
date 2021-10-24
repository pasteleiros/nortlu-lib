package io.github.pasteleiros.nortlulib.entity

import io.github.pasteleiros.nortlulib.enum.FormaPagamento
import io.github.pasteleiros.nortlulib.enum.StatusPedido
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption
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

//    @LazyCollection(LazyCollectionOption.FALSE)
//    @ManyToMany(mappedBy = "pedidos")

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany
    @JoinTable(
        name = "itens_pedidos",
        joinColumns = [JoinColumn(name = "id_pedido")],
        inverseJoinColumns = [JoinColumn(name = "id_produto")]
    )
    val produtos: List<ProdutoEntity> = mutableListOf()

):BaseEntity() {
    constructor() : this(
        id = null,
        usuario = UsuarioEntity(),
        idFormaPagamento = FormaPagamento.DEBITO.id,
        idStatus = StatusPedido.SOLICITADO.id,
        valorTotal = BigDecimal.ZERO
    )
}