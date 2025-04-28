package com.willywonka;

import com.willywonka.model.Fornecedor;
import com.willywonka.model.Produto;
import com.willywonka.service.FornecedorService;
import com.willywonka.service.ProdutoService;
import com.willywonka.Menu;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Criando instâncias dos serviços
		FornecedorService dbFornecedor = new FornecedorService();
		ProdutoService dbProdutos = new ProdutoService();
		Menu menu = new Menu();
		/*
		// Criando e adicionando fornecedores
		Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", "123456789", "Rua XYZ", "11999999999");
		Fornecedor fornecedor2 = new Fornecedor("Fornecedor B", "987654321", "Rua ABC", "11888888888");

		dbFornecedor.salvar(fornecedor1);
		dbFornecedor.salvar(fornecedor2);

		// Listando fornecedores
		System.out.println("Lista de Fornecedores:");
		for (Fornecedor fornecedor : dbFornecedor.listar()) {
			System.out.println(fornecedor);
		}

		// Criando e adicionando produtos
		Produto produto1 = new Produto("AÇUCAR", 10.5, 100);
		Produto produto2 = new Produto("CACAU", 15.0, 100);
		Produto produto3 = new Produto("AMENDOIM", 20.0, 100);

		dbProdutos.salvar(produto1);
		dbProdutos.salvar(produto2);
		dbProdutos.salvar(produto3);

		// Listando produtos
		System.out.println("\nLista de Produtos:");
		List<Produto> produtos = dbProdutos.listar();
		for(Produto produto : dbProdutos.listar()) {
			System.out.println(produto);
		};
		*/

		menu.mostrarMenu();
	}
}
