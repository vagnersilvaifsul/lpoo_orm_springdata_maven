package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_1_1;

import jakarta.persistence.*;

import java.time.LocalDate;

/*
    Introdução: Como mapear uma classe para entidade de banco de dados relacional.
 */
@Entity(name = "Socio")
@Table(name="socios")
public class Socio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate aniversario;
}
