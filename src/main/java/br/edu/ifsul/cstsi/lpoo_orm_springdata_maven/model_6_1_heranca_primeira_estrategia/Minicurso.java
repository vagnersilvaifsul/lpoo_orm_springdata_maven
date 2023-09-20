package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_1_heranca_primeira_estrategia;

import jakarta.persistence.Entity;

@Entity
public class Minicurso extends Submissao{
    private String justificativa;
    private String objetivo;
    private Integer duaracao;
    private String publico;
    private String material;
    private String curriculo;
    private String arquivo;

}
