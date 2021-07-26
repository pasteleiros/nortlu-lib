package io.github.pasteleiros.nortlulib.dto

import io.github.pasteleiros.nortlulib.enum.FormaPagamento
import java.math.BigDecimal

data class PedidoDto(val id: Long?,
                     val items: List<ProdutoDto>,
                     val usuario: UsuarioDto,
                     val formaPagamento: FormaPagamento,
                     val valorTotal: BigDecimal):BaseDto()