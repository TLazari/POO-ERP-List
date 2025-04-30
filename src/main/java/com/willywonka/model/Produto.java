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
    private Fornecedor fornecedor;

    public Produto() {}

    public Produto(String nome, Double preco, double quantidade, Fornecedor fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }
    public Produto(String nome, Double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fornecedor = null;
    }


    @Override
    public String toString() {
        return "Id - " + getId()
                + " - Produto: " + nome
                +  ", preco: " + preco
                + ", quantidade: " + quantidade
                +", fornecedor: " + (fornecedor != null ? fornecedor.getNome() : "Sem fornecedor");
    }
}
