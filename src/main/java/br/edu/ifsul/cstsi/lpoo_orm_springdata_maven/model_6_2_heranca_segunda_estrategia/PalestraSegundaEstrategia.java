package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_2_heranca_segunda_estrategia;

import jakarta.persistence.*;

@Entity(name = "PalestraSegundaEstrategia")
@Table(name = "palestras")
public class PalestraSegundaEstrategia extends SubmissaoSegundaEstrategia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String objetivo;
    private String resumo;
    private String curriculo;
}
