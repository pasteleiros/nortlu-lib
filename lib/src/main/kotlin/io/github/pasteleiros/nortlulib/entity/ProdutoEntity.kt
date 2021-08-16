package io.github.pasteleiros.nortlulib.entity

import io.micronaut.core.annotation.Introspected
import java.math.BigDecimal
import javax.persistence.*


@Introspected
@Entity(name = "produto")
data class ProdutoEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
    val nome: String,
    val descricao: String,
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    val categoria: CategoriaEntity,
    val valor: BigDecimal,
    val foto: String
) : BaseEntity() {

    @ManyToMany(mappedBy = "itens", cascade = [CascadeType.ALL])
    var pedidos: List<PedidoEntity> = listOf();
}
