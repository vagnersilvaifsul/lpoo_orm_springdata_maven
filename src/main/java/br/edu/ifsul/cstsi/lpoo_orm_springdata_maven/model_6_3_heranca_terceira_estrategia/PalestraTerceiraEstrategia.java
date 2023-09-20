package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_6_3_heranca_terceira_estrategia;

import jakarta.persistence.*;

@Entity(name = "PalestraTerceiraEstrategia")
@Table(name = "palestras3")
public class PalestraTerceiraEstrategia extends SubmissaoTerceiraEstrategia {
    private String objetivo;
    private String resumo;
    private String curriculo;
}
