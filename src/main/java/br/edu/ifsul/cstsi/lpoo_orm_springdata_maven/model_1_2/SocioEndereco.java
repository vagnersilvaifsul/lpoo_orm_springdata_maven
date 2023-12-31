package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_1_2;

import jakarta.persistence.*;

import java.time.LocalDate;

/*
    Introdução: Essa estratégia demonstra como criar uma única tabela para duas classes
    associadas com @Embedded.
 */
@Entity(name = "SocioEndereco")
@Table(name="socios_endereco")
public class SocioEndereco {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;
    private String nome;
    //private String endereco; //sai isso
    private String telefone;
    private LocalDate aniversario;
    @Embedded
    private Endereco endereco; //entra isso
}
