package io.github.pasteleiros.nortlulib.dto

import java.math.BigDecimal

data class ItemPedidoDto(val id: Long?,
                         val nome: String,
                         val descricao: String,
                         val categoria: CategoriaDto,
                         val valor: BigDecimal,
                         val foto: String):BaseDto()
