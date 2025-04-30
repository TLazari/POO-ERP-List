package com.willywonka.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Produto extends EntidadeBase{

    private String nome;
    private Double preco;
    private String descricao;
    private double quantidade;
    private Fornecedor fornecedor;

    // Construtores
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

    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    // Métodos
    @Override
    public String toString() {
        return "Id - " + getId()
                + " - Produto: " + nome
                +  ", preco: " + preco
                + ", quantidade: " + quantidade
                +", fornecedor: " + (fornecedor != null ? fornecedor.getNome() : "Fabricacao Propria");
    }
}
