package com.github.pasteleiros.nortlulib.mapper

import com.github.pasteleiros.nortlulib.dto.ItemPedidoDto
import com.github.pasteleiros.nortlulib.entity.ItemPedidoEntity

fun ItemPedidoDto.toEntity() = ItemPedidoEntity(this.id,this.nome,this.descricao,this.categoria.toEntity(),this.valor,this.foto)
fun ItemPedidoEntity.toDto() = ItemPedidoDto(this.id,this.nome,this.descricao,this.categoria.toDto(),this.valor,this.foto)
fun List<ItemPedidoDto>.toListDto():List<ItemPedidoEntity> = this.map{it.toEntity()}
fun List<ItemPedidoEntity>.toListEntity():List<ItemPedidoDto> = this.map{it.toDto()}