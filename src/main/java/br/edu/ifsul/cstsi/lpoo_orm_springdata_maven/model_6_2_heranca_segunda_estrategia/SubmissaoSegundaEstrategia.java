package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_2_heranca_segunda_estrategia;

import jakarta.persistence.*;

/*
    Nesta estratégia é criada uma tabela para cada classe concreta.
 */

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class SubmissaoSegundaEstrategia {
    protected String titulo;
    @Enumerated(EnumType.STRING)
    protected Situacao situacao;
}
