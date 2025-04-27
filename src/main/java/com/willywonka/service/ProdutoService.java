package com.willywonka.service;

import com.willywonka.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProdutoService {

    private final List<Produto> produtos = new ArrayList<>();
    private Long currentId = 1L;

    // Listar todos os produtos
    public List<Produto> listar() {
        return produtos;
    }

    // Salvar um novo produto
    public void salvar(Produto produto) {
        produto.setId(currentId++);
        produtos.add(produto);
    }

    // Excluir um produto
    public void excluir(Long id) {
        produtos.removeIf(produto -> produto.getId().equals(id));
    }

    // Buscar um produto pelo ID
    public Produto buscarPorId(Long id) {
        Optional<Produto> produto = produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
        return produto.orElse(null);
    }
}
