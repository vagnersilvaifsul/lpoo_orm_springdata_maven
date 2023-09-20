package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_3_1_associacao_um_para_muitos;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity(name = "Dependente")
@Table(name = "dependentes")
public class Dependente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate aniversario;
    @ManyToOne
    @JoinColumn(name = "socio_id", referencedColumnName = "id")
    private Socio_1_para_muitos socio;
}
