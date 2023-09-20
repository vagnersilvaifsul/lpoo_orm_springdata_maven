package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_1_heranca_primeira_estrategia;

import jakarta.persistence.*;

/*
    Nesta estratégia é criada uma tabela única.
 */
@Entity(name = "Submissao")
@Table(name = "submissoes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="submissao_tipo",
    discriminatorType = DiscriminatorType.STRING)
public abstract class Submissao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    protected String titulo;
    @Enumerated(EnumType.STRING)
    protected Situacao situacao;
}
