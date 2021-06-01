package com.nortlu.dto

import com.nortlu.enum.FormaPagamento
import java.math.BigDecimal

data class PedidoDto(val id: Long?,
                     val items: List<ItemPedidoDto>,
                     val usuario: UsuarioDto,
                     val formaPagamento: FormaPagamento,
                     val valorTotal: BigDecimal)