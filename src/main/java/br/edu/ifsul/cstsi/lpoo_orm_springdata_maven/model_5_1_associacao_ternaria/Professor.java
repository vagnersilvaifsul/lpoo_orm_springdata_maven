package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_5_1_associacao_ternaria;

import jakarta.persistence.*;

import java.util.List;

/*
    Exemplo de associação ternária.
 */
@Entity(name = "Professor")
@Table(name = "professores")
public class Professor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Enumerated(EnumType.STRING)
    private Curso curso;

    @ManyToMany
    @JoinTable(
        name = "professores_turmas",
        joinColumns = @JoinColumn(name = "professores_id"),
        inverseJoinColumns = @JoinColumn(name = "turmas_id"))
    private List<Turma> turmas;

    @ManyToMany
    @JoinTable(
        name = "professores_salas",
        joinColumns = @JoinColumn(name = "professores_id"),
        inverseJoinColumns = @JoinColumn(name = "salas_id"))
    private List<Sala> salas;
}
