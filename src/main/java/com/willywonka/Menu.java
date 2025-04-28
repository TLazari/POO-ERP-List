package com.willywonka;

import com.willywonka.model.Produto;
import com.willywonka.service.ProdutoService;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;
    ProdutoService dbProdutos = new ProdutoService();

    public void mostrarMenu() {
        do {
            limparConsole();
            System.out.println("==== MENU ====");
            System.out.println("1. Produto");
            System.out.println("2. Fornecedor");
            System.out.println("3. Producao");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuProdutos();
                    break;
                case 2:
                    //fn
                    break;
                case 3:
                    //fn
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Finalizando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
        scanner.close();
    }
    public void menuProdutos (){
        do {
            limparConsole();
            System.out.println("==== MENU ====");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Editar Produto");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Excluir Produto");
            System.out.println("5. Voltar ao menu anterior");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    dbProdutos.adicionarProduto();
                    opcao = scanner.nextInt();
                    break;
                case 2:
                    dbProdutos.editarProduto();
                    opcao = scanner.nextInt();
                    break;
                case 3:
                    dbProdutos.listar();
                    if (dbProdutos.listar().isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produto produto : dbProdutos.listar()) {
                            System.out.println(produto);
                        }
                    }
                    opcao = scanner.nextInt();
                    break;

                case 4:
                    dbProdutos.excluirProduto();
                    opcao = scanner.nextInt();
                    break;
                case 5:
                    mostrarMenu();
                case 0:
                    System.out.println("Finalizando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
        scanner.close();
    };
    public void mostrarFornecedor() {
        do {
            limparConsole();
            System.out.println("==== MENU ====");
            System.out.println("1. Cadastrar Fornecedor");
            System.out.println("2. Editar Fornecedor");
            System.out.println("3. Listar Fornecedores");
            System.out.println("4. Excluir Fornecedor");
            System.out.println("6. Voltar ao menu anterior");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuProdutos();
                    break;
                case 2:
                    //fn
                    break;
                case 3:
                    //fn
                    break;
                case 4:
                    //fn
                    break;
                case 5:
                    //fn
                    break;
                case 6:
                    //fn
                    break;
                case 0:
                    System.out.println("Finalizando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
        scanner.close();
    }
    public void mostrarProducao(){
        do {
            limparConsole();
            System.out.println("==== MENU ====");
            System.out.println("1. Produzir Barra de Chocolate");
            System.out.println("2. Produzir Snicker");
            System.out.println("9. Voltar ao menu anterior");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    //fn;
                    break;
                case 2:
                    //fn
                    break;
                case 9:
                    //fn
                    break;
                case 0:
                    System.out.println("Finalizando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);
        scanner.close();
    }

    public void limparConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}
