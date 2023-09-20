package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_3_1_associacao_um_para_muitos;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "Socio_1_para_muitos")
@Table(name = "socios_1_para_muitos")
public class Socio_1_para_muitos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false, length = 20)
    private String telefone;
    @Column(nullable = false)
    private LocalDate aniversario;
    @Column(nullable = false, length = 100, unique=true)
    private String email;
    @OneToMany(mappedBy = "socio")
    private List<Dependente> dependentes;
}
