package io.github.pasteleiros.nortlulib.mapper

import io.github.pasteleiros.nortlulib.dto.ProdutoDto
import io.github.pasteleiros.nortlulib.entity.ProdutoEntity

fun ProdutoDto.toEntity() = ProdutoEntity(this.id,this.nome,this.descricao,this.categoria.toEntity(),this.valor,this.foto)
fun ProdutoEntity.toDto() = ProdutoDto(this.id,this.nome,this.descricao,this.categoria.toDto(),this.valor,this.foto)
fun List<ProdutoDto>.toListEntity():List<ProdutoEntity> = this.map{it.toEntity()}
fun List<ProdutoEntity>.toListDto():List<ProdutoDto> = this.map{it.toDto()}