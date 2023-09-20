package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_3_heranca_terceira_estrategia;

import jakarta.persistence.*;

@Entity(name = "ArtigoTerceiraEstrategia")
@Table(name = "artigos3")
public class ArtigoTerceiraEstrategia extends SubmissaoTerceiraEstrategia {
    private String resumo;
    private String abstract_en;
    private String arquivo;
}
