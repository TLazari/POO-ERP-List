package com.willywonka.service;

import com.willywonka.model.Fornecedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class FornecedorService {

    private final List<Fornecedor> fornecedores = new ArrayList<>();
    private int currentId = 1;

    // Listar todos os fornecedores
    public List<Fornecedor> listar() {
        return fornecedores;
    }

    // Salvar um novo fornecedor
    public void salvar(Fornecedor fornecedor) {
        fornecedor.setId(currentId++);
        fornecedores.add(fornecedor);
    }

    // Excluir um fornecedor
    public void excluir(int id) {
        fornecedores.removeIf(fornecedor -> fornecedor.getId() == id);
    }

    // Buscar um fornecedor pelo ID
    public Fornecedor buscarPorId(int id) {
        Optional<Fornecedor> fornecedor = fornecedores.stream()
                .filter(f -> f.getId() == id)
                .findFirst();
        return fornecedor.orElse(null);
    }
}
