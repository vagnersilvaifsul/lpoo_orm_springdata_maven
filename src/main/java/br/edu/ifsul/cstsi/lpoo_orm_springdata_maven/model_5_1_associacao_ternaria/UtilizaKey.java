package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_5_1_associacao_ternaria;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class UtilizaKey implements Serializable{
    Long professores_id;
    Long salas_id;
    Long turmas_id;
}
