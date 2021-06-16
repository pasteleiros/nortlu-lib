package com.github.pasteleiros.nortlulib.entity

import com.github.pasteleiros.nortlulib.enum.FormaPagamento
import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "pedido")
data class PedidoEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
        val items: List<ItemPedidoEntity>,
        val usuario: UsuarioEntity,
        val formaPagamento: FormaPagamento,
        val valorTotal: BigDecimal):BaseEntity()