package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_1_2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/*
    Essa estratégia demonstra como criar uma única tabela para duas classes associadas com @Embedded.
 */
@Entity(name = "SocioEndereco")
@Table(name="socios_endereco")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
