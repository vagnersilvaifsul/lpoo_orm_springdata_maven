package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_1_heranca_primeira_estrategia;

import jakarta.persistence.Entity;

@Entity
public class Palestra extends Submissao{
    private String objetivo;
    private String resumo;
    private String curriculo;
}
