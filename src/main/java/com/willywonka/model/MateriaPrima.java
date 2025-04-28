package com.willywonka.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MateriaPrima extends EntidadeBase {

    private String nome;
    private String unidadeMedida; // Ex: kg, litro, metro
}
