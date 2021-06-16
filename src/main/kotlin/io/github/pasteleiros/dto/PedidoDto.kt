package com.github.pasteleiros.nortlulib.dto

import com.github.pasteleiros.nortlulib.enum.FormaPagamento
import java.math.BigDecimal

data class PedidoDto(val id: Long?,
                     val items: List<ItemPedidoDto>,
                     val usuario: UsuarioDto,
                     val formaPagamento: FormaPagamento,
                     val valorTotal: BigDecimal):BaseDto()