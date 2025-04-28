package com.willywonka.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Fornecedor {

    private int id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;

    public Fornecedor() {}
    public Fornecedor(String nome, String cnpj, String endereco, String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;

    }
    @Override
    public String toString() {
        return id + " - Fornecedor: " + nome +
                ", CNPJ=" + cnpj +
                ", Endereco= " + endereco +
                ", Telefone= " + telefone ;

    }
}
