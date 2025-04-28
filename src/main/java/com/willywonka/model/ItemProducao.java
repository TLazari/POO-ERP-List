package com.willywonka.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class ItemProducao {

    private Produto produto;
    private Integer quantidade;

    // Construtor
    public ItemProducao(Produto produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ItemProducao{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }
}
