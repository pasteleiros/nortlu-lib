package com.github.pasteleiros.nortlulib.mapper

import com.github.pasteleiros.nortlulib.dto.UsuarioDto
import com.github.pasteleiros.nortlulib.entity.UsuarioEntity

fun UsuarioEntity.toDto() = UsuarioDto(this.id,this.nome,this.cpf,this.email,this.telefone,this.enderecos.toListDto())
fun UsuarioDto.toEntity() = UsuarioEntity(this.id,this.nome,this.cpf,this.email,this.telefone,this.enderecos.toListEntity())