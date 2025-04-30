/*
 * @author Ruan Lucas
 */

package com.willywonka.model;

public class Fornecedor extends EntidadeBase {

    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;

    //Construtores
    public Fornecedor() {}
    public Fornecedor(String nome, String cnpj, String endereco, String telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //MÉTODOS
    @Override
    public String toString() {
        return getId() + " - Fornecedor: " + nome +
                ", CNPJ=" + cnpj +
                ", Endereco= " + endereco +
                ", Telefone= " + telefone ;

    }
}
