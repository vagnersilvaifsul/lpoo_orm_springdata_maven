package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_7_1_classe_associativa;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Fornecedor")
@Table(name = "fornecedores")
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtos;

}
