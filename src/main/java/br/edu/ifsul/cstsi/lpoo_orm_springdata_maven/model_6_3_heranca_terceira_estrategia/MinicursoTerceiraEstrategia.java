package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_3_heranca_terceira_estrategia;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "submissoes_terceira_estrategia_id")
public class MinicursoTerceiraEstrategia extends SubmissaoTerceiraEstrategia {
    private String justificativa;
    private String objetivo;
    private Integer duaracao;
    private String publico;
    private String material;
    private String curriculo;
    private String arquivo;

}
