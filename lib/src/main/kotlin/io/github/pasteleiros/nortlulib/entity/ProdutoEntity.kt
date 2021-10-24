package io.github.pasteleiros.nortlulib.entity

import io.micronaut.core.annotation.Introspected
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption
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
    val foto: String = "",
    val ativo: Boolean = false
) : BaseEntity() {
    //    @ManyToMany
//    @JoinTable(
//        name = "itens_pedidos",
//        joinColumns = [JoinColumn(name = "id_produto")],
//        inverseJoinColumns = [JoinColumn(name = "id_pedido")]
//    )
    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(mappedBy = "produtos")
    var pedidos: List<PedidoEntity> = mutableListOf()
}
