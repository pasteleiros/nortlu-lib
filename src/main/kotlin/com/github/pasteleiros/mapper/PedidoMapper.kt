package com.github.pasteleiros.nortlulib.mapper

import com.github.pasteleiros.nortlulib.dto.PedidoDto
import com.github.pasteleiros.nortlulib.entity.PedidoEntity

fun PedidoDto.toEntity() = PedidoEntity(this.id, this.items.toListDto(), this.usuario.toEntity(), this.formaPagamento, this.valorTotal)
fun PedidoEntity.toDto() = PedidoDto(this.id, this.items.toListEntity(), this.usuario.toDto(), this.formaPagamento, this.valorTotal)