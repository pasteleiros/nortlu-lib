package com.github.pasteleiros.nortlulib.mapper

import io.github.pasteleiros.nortlulib.dto.EnderecoDto
import io.github.pasteleiros.nortlulib.dto.PedidoDto
import io.github.pasteleiros.nortlulib.entity.EnderecoEntity
import io.github.pasteleiros.nortlulib.entity.PedidoEntity
import io.github.pasteleiros.nortlulib.enum.FormaPagamento
import io.github.pasteleiros.nortlulib.enum.StatusPedido
import io.github.pasteleiros.nortlulib.mapper.toDto
import io.github.pasteleiros.nortlulib.mapper.toEntity
import io.github.pasteleiros.nortlulib.mapper.toListDto
import io.github.pasteleiros.nortlulib.mapper.toListEntity

fun PedidoDto.toEntity() = PedidoEntity(this.id, this.items.toListDto(), this.usuario.toEntity(), this.formaPagamento.id, this.statusPedido.id,this.valorTotal)
fun PedidoEntity.toDto() = PedidoDto(this.id, this.items.toListEntity(), this.usuario.toDto(), FormaPagamento.parse(this.idFormaPagamento),
    StatusPedido.parse(this.idStatus),this.valorTotal)
fun List<PedidoDto>.toListEntity():List<PedidoEntity> = this.map{ e -> e.toEntity()}
fun List<PedidoEntity>.toListDto():List<PedidoDto> = this.map{ e -> e.toDto()}