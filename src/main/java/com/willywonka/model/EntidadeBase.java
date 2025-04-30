/*
 * @author Rayza Luana
 */

package com.willywonka.model;

public abstract class EntidadeBase {
    //Atributo da classe
    private int id;

    //Construtor sem parametro
    public EntidadeBase() {}

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
