package io.github.pasteleiros.nortlulib.entity

import javax.persistence.*

@Entity(name = "usuario")
data class UsuarioEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long?,
        val nome: String,
        val cpf: String,
        val email: String,
        val telefone: String,
        @ManyToMany( fetch = FetchType.EAGER)
        @JoinTable(name = "usuario_endereco",
                joinColumns = [JoinColumn(name = "id_usuario", referencedColumnName = "id")],
                inverseJoinColumns = [JoinColumn(name = "id_endereco", referencedColumnName = "id")])
        val enderecos: List<EnderecoEntity> = listOf()):BaseEntity() {
    constructor() : this(id = null, nome = "", cpf = "", email = "", telefone = "", enderecos = listOf())
}