package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_4_1_associacao_muitos_para_muitos;

import jakarta.persistence.*;

import java.util.List;

/*
    Para mapear relaçõe Muitos-para-Muitos existem três possibilidades.
    Acesse os exemplos no repositório do professor, em:
    https://github.com/vagnersilvaifsul/orm_many_to_many_basic.git
    https://github.com/vagnersilvaifsul/orm_many_to_many_rel_com_atributo.git
    https://github.com/vagnersilvaifsul/orm_many_to_many_new_entity.git

    Experimente gerar os diagramas de classes e banco de dados.
    Nesse pacote estão incluídas imagens desses diagramas gerados pela própria IDE. Para isso, basca selecionar
    o que você quer gerar o diagrama e clicar com o lado direito do mouse e escolher diagrams. Depois é só personalizar.
 */

@Entity(name = "PessoaMM")
@Table(name = "pessoas_mm")
public class Pessoa {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    @ManyToMany
    @JoinTable(
        name = "pessoas_contas",
        joinColumns = @JoinColumn(name = "pessoas_mm_id"),
        inverseJoinColumns = @JoinColumn(name = "contas_id"))
    private List<Conta> contas;
}
