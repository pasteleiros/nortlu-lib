package io.github.pasteleiros.nortlulib.entity

import io.micronaut.core.annotation.Introspected
import java.math.BigDecimal
import javax.persistence.*


@Introspected
@Entity(name = "produto")
data class ProdutoEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long? = null,
    val nome: String = "",
    val descricao: String = "",
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    val categoria: CategoriaEntity = CategoriaEntity(),
    val valor: BigDecimal = BigDecimal.ZERO,
    val foto: String = ""
) : BaseEntity() {

    @ManyToMany( fetch = FetchType.EAGER)
    @JoinTable(name = "itens_pedido",
        joinColumns = [JoinColumn(name = "id_produto", referencedColumnName = "id")],
        inverseJoinColumns = [JoinColumn(name = "id_epedido", referencedColumnName = "id")])
    val itensPedido: List<PedidoEntity> = listOf()
}
