package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_4_1_associacao_muitos_para_muitos;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "Conta")
@Table(name = "contas")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal saldo;
    @ManyToMany(mappedBy = "contas")
    private List<PessoaMM> pessoas;
}
