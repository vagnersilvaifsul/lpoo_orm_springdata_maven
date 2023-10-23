package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_2_heranca_segunda_estrategia;

import jakarta.persistence.*;

/*
    Nesta estratégia é criada uma tabela para cada classe concreta.
 */

@MappedSuperclass
public abstract class SubmissaoSegundaEstrategia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String titulo;
    @Enumerated(EnumType.STRING)
    protected Situacao situacao;
}
