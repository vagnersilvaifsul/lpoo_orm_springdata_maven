package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_7_1_classe_associativa;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "Produto")
@Table(name = "produtos")
public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer estoque;
    private BigDecimal valor;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id", referencedColumnName = "id")
    private Fornecedor fornecedor;
}
