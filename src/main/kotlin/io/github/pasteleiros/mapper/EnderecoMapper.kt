package com.github.pasteleiros.nortlulib.mapper

import com.github.pasteleiros.nortlulib.dto.EnderecoDto
import com.github.pasteleiros.nortlulib.entity.EnderecoEntity

fun EnderecoDto.toEntity() = EnderecoEntity(this.id, this.logradouro, this.numero, this.complemento, this.bairro, this.cidade, this.cep, this.observacao)
fun EnderecoEntity.toDto() = EnderecoDto(this.id, this.logradouro, this.numero, this.complemento, this.bairro, this.cidade, this.cep, this.observacao)
fun List<EnderecoDto>.toListEntity():List<EnderecoEntity> = this.map{e -> e.toEntity()}
fun List<EnderecoEntity>.toListDto():List<EnderecoDto> = this.map{e -> e.toDto()}