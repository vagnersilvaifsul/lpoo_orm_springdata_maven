package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_1_heranca_primeira_estrategia;

import jakarta.persistence.Entity;

@Entity
public class Artigo extends Submissao{
    private String resumo;
    private String abstract_en;
    private String arquivo;
}
