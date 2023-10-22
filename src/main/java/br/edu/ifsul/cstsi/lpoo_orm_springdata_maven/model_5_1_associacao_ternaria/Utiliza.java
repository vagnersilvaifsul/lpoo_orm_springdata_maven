package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_5_1_associacao_ternaria;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Utiliza {

    @EmbeddedId
    UtilizaKey id;
}
