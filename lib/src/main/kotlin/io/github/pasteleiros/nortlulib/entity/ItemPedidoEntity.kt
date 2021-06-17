package io.github.pasteleiros.nortlulib.entity

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "item_pedido")
data class ItemPedidoEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
        val nome: String,
        val descricao: String,
        val categoria: CategoriaEntity,
        val valor: BigDecimal,
        val foto: String):BaseEntity()
