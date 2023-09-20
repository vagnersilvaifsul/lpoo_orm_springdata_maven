package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_3_heranca_terceira_estrategia;

import jakarta.persistence.*;

@Entity(name = "MinicursoTerceiraEstrategia")
@Table(name = "minicursos3")
public class MinicursoTerceiraEstrategia extends SubmissaoTerceiraEstrategia {
    private String justificativa;
    private String objetivo;
    private Integer duaracao;
    private String publico;
    private String material;
    private String curriculo;
    private String arquivo;

}
