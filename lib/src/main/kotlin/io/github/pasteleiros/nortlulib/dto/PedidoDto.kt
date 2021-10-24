package io.github.pasteleiros.nortlulib.dto

import io.github.pasteleiros.nortlulib.enum.FormaPagamento
import io.github.pasteleiros.nortlulib.enum.StatusPedido
import java.math.BigDecimal
import javax.persistence.EnumType
import javax.persistence.Enumerated

data class PedidoDto(val id: Long?,
                     var itens: List<ProdutoDto>,
                     val usuario: UsuarioDto,
                     val formaPagamento: FormaPagamento,
                     var statusPedido: StatusPedido,
                     val valorTotal: BigDecimal):BaseDto()