package io.github.pasteleiros.nortlulib.entity

import java.math.BigDecimal
import javax.persistence.*

@Entity(name = "item_pedido")
data class ItemPedidoEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
        val nome: String,
        val descricao: String,
        @ManyToOne
        @JoinColumn(name = "id_categoria")
        val categoria: CategoriaEntity,
        val valor: BigDecimal,
        val foto: String):BaseEntity() {
            @ManyToOne
            @JoinColumn(name = "id_pedido")
            var pedido: PedidoEntity = PedidoEntity()
        }
