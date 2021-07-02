package io.github.pasteleiros.nortlulib.mapper

import io.github.pasteleiros.nortlulib.dto.CategoriaDto
import io.github.pasteleiros.nortlulib.entity.CategoriaEntity

fun CategoriaDto.toEntity() = CategoriaEntity(this.id, this.descricao)
fun CategoriaEntity.toDto() = CategoriaDto(this.id, this.descricao)
fun List<CategoriaDto>.toListEntity():List<CategoriaEntity> = this.map{ e -> e.toEntity()}
fun List<CategoriaEntity>.toListDto():List<CategoriaDto> = this.map{ e -> e.toDto()}