package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_5_1_associacao_ternaria;

import jakarta.persistence.*;

import java.util.List;

/*
    Exemplo de associação ternária.
 */
@Entity(name = "Turma")
@Table(name = "turmas")
public class Turma {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private Curso curso;

    @ManyToMany(mappedBy = "turmas")
    private List<Professor> professores;
    @ManyToMany
    @JoinTable(
        name = "utiliza",
        joinColumns = @JoinColumn(name = "turmas_id")
    )
    private List<Sala> salas;
}
