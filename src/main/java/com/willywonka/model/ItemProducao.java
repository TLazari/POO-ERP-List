package com.willywonka.model;

import lombok.Getter;
import lombok.Setter;

// Classe que representa o item da produção
@Getter
@Setter
public class ItemProducao {

    private MateriaPrima materiaPrima;

    private Integer quantidade;
}
