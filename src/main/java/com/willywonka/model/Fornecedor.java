package com.willywonka.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Fornecedor {

    // Getters e Setters
    private Long id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;

    public Fornecedor() {}
    public Fornecedor(String nome, String cnpj, String endereco, String telefone) {}
}
