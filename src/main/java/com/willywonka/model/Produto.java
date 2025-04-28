package com.willywonka.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Produto {

    private int id;
    private String nome;
    private Double preco;
    private String descricao;
    private double quantidade;

    public Produto(String nome, Double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produto() {}

    @Override
    public String toString() {
        return "Id - " + getId()
                + " - Produto: " + nome
                +  ", preco: " + preco
                + ", quantidade: " + quantidade;
    }
}
