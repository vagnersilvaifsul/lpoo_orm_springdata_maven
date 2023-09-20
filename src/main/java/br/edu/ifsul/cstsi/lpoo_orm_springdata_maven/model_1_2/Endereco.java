package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model_1_2;

import jakarta.persistence.Embeddable;

@Embeddable //indica que essa classe ficará na mesma tabela de quem a utiliza
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String numero;
    private String complemento;
}
