package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_2_heranca_segunda_estrategia;

import jakarta.persistence.*;

@Entity(name = "ArtigoSegundaEstrategia")
@Table(name = "artigos")
public class ArtigoSegundaEstrategia extends SubmissaoSegundaEstrategia {
    private String resumo;
    private String abstract_en;
    private String arquivo;
}
