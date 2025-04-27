package com.willywonka.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Produto {

    // Getters e Setters
    private Long id;
    private String nome;
    private Double preco;
    private String descricao;


    public Produto(String nome, Double preco) {}
}
