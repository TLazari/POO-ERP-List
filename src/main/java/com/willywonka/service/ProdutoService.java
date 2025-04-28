package com.willywonka.service;

import com.willywonka.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProdutoService {

    private final Scanner scanner = new Scanner(System.in);
    private final List<Produto> produtos = new ArrayList<>();
    private int currentId = 1;

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
    public void excluir(int id) {
        produtos.removeIf(produto -> produto.getId()== id );
    }

    // Buscar um produto pelo ID
    public Produto buscarPorId(int id) {
        Optional<Produto> produto = produtos.stream()
                .filter(p -> p.getId()== id )
                .findFirst();
        return produto.orElse(null);
    }
    // Buscar pelo Nome
    public Produto buscarPorNome(String nome) {
        Optional<Produto> produto = produtos.stream()
                .filter(p -> p.getNome().equals(nome))
                .findFirst();
        return produto.orElse(null);
    }

    //Utilitários pelo Menu

    public void adicionarProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir o \n

        System.out.println("Digite a quantidade do produto:");
        double qtd = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(qtd);

        this.salvar(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    public void excluirProduto() {
        System.out.println("Digite o ID do produto que deseja excluir:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n

        Produto produtoEncontrado = buscarPorId(id);

        if (produtoEncontrado != null) {
            produtos.remove(produtoEncontrado);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }
    // Editar um produto
    public void editarProduto() {
        System.out.println("Digite o ID do produto que deseja editar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n

        Produto produtoEncontrado = buscarPorId(id);

        if (produtoEncontrado != null) {
            System.out.println("Produto encontrado: " + produtoEncontrado.getNome());

            System.out.println("Digite o novo nome do produto (ou pressione Enter para manter o nome atual):");
            String novoNome = scanner.nextLine();
            if (!novoNome.isEmpty()) {
                produtoEncontrado.setNome(novoNome);
            }

            System.out.println("Digite o novo preço do produto (ou pressione Enter para manter o preço atual):");
            String novoPrecoInput = scanner.nextLine();
            if (!novoPrecoInput.isEmpty()) {
                double novoPreco = Double.parseDouble(novoPrecoInput);
                produtoEncontrado.setPreco(novoPreco);
            }

            System.out.println("Digite a nova quantidade do produto (ou pressione Enter para manter a quantidade atual):");
            String novaQtdInput = scanner.nextLine();
            if (!novaQtdInput.isEmpty()) {
                double novaQtd = Double.parseDouble(novaQtdInput);
                produtoEncontrado.setQuantidade(novaQtd);
            }

            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

}
