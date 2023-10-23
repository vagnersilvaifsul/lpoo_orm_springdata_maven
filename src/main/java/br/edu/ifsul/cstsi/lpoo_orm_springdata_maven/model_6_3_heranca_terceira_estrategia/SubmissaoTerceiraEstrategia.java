package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_3_heranca_terceira_estrategia;

import jakarta.persistence.*;

/*
    Nesta estratégia é criada uma tabela para cada classe.
 */

@Entity(name = "SubmissaoTerceiraEstrategia")
@Table(name = "submissoes_terceira_estrategia")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class SubmissaoTerceiraEstrategia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String titulo;
    @Enumerated(EnumType.STRING)
    protected Situacao situacao;
}
