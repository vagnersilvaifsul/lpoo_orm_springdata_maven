package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_7_1_classe_associativa;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Fornecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate data;
    private BigDecimal total;

    @OneToOne
    Produto produto;
    @OneToOne
    Fornecedor fornecedor;

}
