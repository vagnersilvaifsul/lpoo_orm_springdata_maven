package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_3_heranca_terceira_estrategia;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "artigo_terceira_estrategia")
@PrimaryKeyJoinColumn(name = "submissoes_terceira_estrategia_id")
public class ArtigoTerceiraEstrategia extends SubmissaoTerceiraEstrategia {
    private String resumo;
    private String abstract_en;
    private String arquivo;
}
