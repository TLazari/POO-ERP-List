package com.willywonka;

import com.willywonka.model.Fornecedor;
import com.willywonka.model.Produto;
import com.willywonka.service.FornecedorService;
import com.willywonka.service.ProdutoService;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Criando instâncias dos serviços
		FornecedorService fornecedorService = new FornecedorService();
		ProdutoService produtoService = new ProdutoService();

		// Criando e adicionando fornecedores
		Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", "123456789", "Rua XYZ", "11999999999");
		Fornecedor fornecedor2 = new Fornecedor("Fornecedor B", "987654321", "Rua ABC", "11888888888");

		fornecedorService.salvar(fornecedor1);
		fornecedorService.salvar(fornecedor2);

		// Listando fornecedores
		System.out.println("Lista de Fornecedores:");
		List<Fornecedor> fornecedores = fornecedorService.listar();
		fornecedores.forEach(System.out::println);

		// Criando e adicionando produtos
		Produto produto1 = new Produto("Produto A", 10.5);
		Produto produto2 = new Produto("Produto B", 15.0);

		produtoService.salvar(produto1);
		produtoService.salvar(produto2);

		// Listando produtos
		System.out.println("\nLista de Produtos:");
		List<Produto> produtos = produtoService.listar();
		produtos.forEach(System.out::println);
	}
}
