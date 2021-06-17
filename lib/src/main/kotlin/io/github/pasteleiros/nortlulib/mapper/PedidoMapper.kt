package com.github.pasteleiros.nortlulib.mapper

import io.github.pasteleiros.nortlulib.dto.PedidoDto
import io.github.pasteleiros.nortlulib.entity.PedidoEntity
import io.github.pasteleiros.nortlulib.mapper.toDto
import io.github.pasteleiros.nortlulib.mapper.toEntity
import io.github.pasteleiros.nortlulib.mapper.toListDto
import io.github.pasteleiros.nortlulib.mapper.toListEntity

fun PedidoDto.toEntity() = PedidoEntity(this.id, this.items.toListDto(), this.usuario.toEntity(), this.formaPagamento, this.valorTotal)
fun PedidoEntity.toDto() = PedidoDto(this.id, this.items.toListEntity(), this.usuario.toDto(), this.formaPagamento, this.valorTotal)