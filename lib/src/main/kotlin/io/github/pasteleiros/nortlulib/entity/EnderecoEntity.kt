package io.github.pasteleiros.nortlulib.entity

import javax.persistence.*

@Entity(name = "endereco")
data class EnderecoEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
        val logradouro: String,
        val numero: Int = 0,
        val complemento: String?,
        val bairro: String = "",
        val cidade: String = "",
        val cep: String = "",
        val observacao: String?
):BaseEntity() {
    @ManyToMany(mappedBy = "enderecos", cascade = [CascadeType.ALL])
    val usuarios: List<UsuarioEntity> = listOf()
    constructor():this(null, "", 0,
            "", "", "", "", "")
}