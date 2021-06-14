package com.github.pasteleiros.nortlulib.mapper

import com.github.pasteleiros.nortlulib.dto.CategoriaDto
import com.github.pasteleiros.nortlulib.entity.CategoriaEntity

fun CategoriaDto.toEntity() = CategoriaEntity(this.id, this.descricao)
fun CategoriaEntity.toDto() = CategoriaDto(this.id, this.descricao)