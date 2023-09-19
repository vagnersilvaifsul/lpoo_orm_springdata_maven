package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_1_1;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "Socio")
@Table(name="socios")
@Data
@NoArgsConstructor
public class Socio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate aniversario;
}
