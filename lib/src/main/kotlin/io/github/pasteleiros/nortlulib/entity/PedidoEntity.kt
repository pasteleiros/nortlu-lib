package io.github.pasteleiros.nortlulib.entity

import io.github.pasteleiros.nortlulib.enum.FormaPagamento
import java.math.BigDecimal
import javax.persistence.*

@Entity(name = "pedido")
data class PedidoEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
    @OneToMany(mappedBy = "pedido")
        val items: List<ProdutoEntity>,
    @OneToOne
        @JoinColumn(name = "id_usuario", referencedColumnName = "id")
        val usuario: UsuarioEntity,
    @Enumerated(EnumType.STRING)
        val formaPagamento: FormaPagamento,
    val valorTotal: BigDecimal):BaseEntity() {
            constructor() : this(
                id = null,
                items = listOf(),
                usuario = UsuarioEntity(),
                formaPagamento = FormaPagamento.DEBITO,
                valorTotal = BigDecimal.ZERO
            )
        }