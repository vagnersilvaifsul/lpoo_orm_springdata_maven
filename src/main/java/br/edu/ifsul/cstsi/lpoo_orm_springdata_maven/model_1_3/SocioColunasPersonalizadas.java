package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_1_3;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "SocioColunasPersonalizadas")
@Table(name="socios_colunas_personalizadas")
@Data
@NoArgsConstructor
public class SocioColunasPersonalizadas {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
    private Long id;
    @Column(name = "nome_socio", nullable = false, length = 50)
    private String nome;
    @Column(name = "endereco_socio", nullable = false, length = 255) //note que se for 255 não precisa declarar, pois é o padrão
    private String endereco;
    @Column(name = "telefone_socio", nullable = false, length = 20)
    private String telefone;
    @Column(name = "aniversario_socio")
    private LocalDate aniversario;
    @Column(name = "email_socio", nullable = false, length = 100, unique=true)
    private String email;
}
