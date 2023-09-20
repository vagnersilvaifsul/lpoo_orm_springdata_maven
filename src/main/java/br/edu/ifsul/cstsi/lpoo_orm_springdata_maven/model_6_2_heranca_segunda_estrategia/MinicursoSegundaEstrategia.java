package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_2_heranca_segunda_estrategia;

import jakarta.persistence.*;

@Entity(name = "MinicursoSegundaEstrategia")
@Table(name = "minicursos")
public class MinicursoSegundaEstrategia extends SubmissaoSegundaEstrategia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String justificativa;
    private String objetivo;
    private Integer duaracao;
    private String publico;
    private String material;
    private String curriculo;
    private String arquivo;

}
