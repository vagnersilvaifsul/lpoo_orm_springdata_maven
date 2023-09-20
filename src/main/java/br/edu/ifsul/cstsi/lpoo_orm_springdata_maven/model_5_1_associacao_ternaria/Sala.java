package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_5_1_associacao_ternaria;

import jakarta.persistence.*;

import java.util.List;

/*
    Exemplo de associação ternária.
 */
@Entity(name = "Sala")
@Table(name = "salas")
public class Sala {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private Curso curso;

    @ManyToMany(mappedBy = "salas")
    private List<Professor> professores;
    @ManyToMany(mappedBy = "salas")
    private List<Turma> turmas;
}
