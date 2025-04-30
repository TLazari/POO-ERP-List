/*
 * @author Rayza Luana e Thiago Lazari
 */

package com.willywonka;

import com.willywonka.model.Fornecedor;
import com.willywonka.model.Produto;
import com.willywonka.service.FornecedorService;
import com.willywonka.service.ProdutoService;
import com.willywonka.service.ReceitaService;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    int opcao = 0;
    ProdutoService dbProdutos = new ProdutoService();
    FornecedorService dbFornecedor = new FornecedorService();
    ReceitaService producaoService = new ReceitaService(dbProdutos);

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
                    menuFornecedor();
                    break;
                case 3:
                    mostrarProducao();
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
            System.out.println("9. Voltar ao menu anterior");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    dbProdutos.adicionarProduto();
                    esperarEnter();
                    break;
                case 2:
                    dbProdutos.editarProduto();
                    esperarEnter();
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
                    esperarEnter();
                    break;

                case 4:
                    dbProdutos.listar();
                    if (dbProdutos.listar().isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        for (Produto produto : dbProdutos.listar()) {
                            System.out.println(produto);
                        }
                    }
                    dbProdutos.excluirProduto();
                    esperarEnter();
                    break;
                case 9:
                    mostrarMenu();
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

    public void menuFornecedor() {
        do {
            limparConsole();
            System.out.println("==== MENU ====");
            System.out.println("1. Cadastrar Fornecedor");
            System.out.println("2. Editar Fornecedor");
            System.out.println("3. Listar Fornecedores");
            System.out.println("4. Excluir Fornecedor");
            System.out.println("9. Voltar ao menu anterior");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    dbFornecedor.adicionarFornecedor();
                    esperarEnter();
                    break;
                case 2:
                    dbFornecedor.editarFornecedor();
                    esperarEnter();
                    break;
                case 3:
                    dbFornecedor.listar();
                    if (dbFornecedor.listar().isEmpty()) {
                        System.out.println("Nenhum fornecedor cadastrado.");
                    } else {
                        for (Fornecedor fornecedor : dbFornecedor.listar()) {
                            System.out.println(fornecedor);
                        }
                    }
                    esperarEnter();
                    break;
                case 4:
                    dbFornecedor.excluirFornecedor();
                    esperarEnter();
                    break;
                case 9:
                    mostrarMenu();
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
                    producaoService.produzirBarraDeChocolate();
                    esperarEnter();
                    break;
                case 2:
                    producaoService.produzirSnicker();
                    esperarEnter();
                    break;
                case 9:
                    mostrarMenu();
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
        this.logo();
    }
    public void logo(){
        System.out.println("\n" +
                " __          ___ _ _        __          __         _         \n" +
                " \\ \\        / (_) | |       \\ \\        / /        | |        \n" +
                "  \\ \\  /\\  / / _| | |_   _   \\ \\  /\\  / /__  _ __ | | ____ _ \n" +
                "   \\ \\/  \\/ / | | | | | | |   \\ \\/  \\/ / _ \\| '_ \\| |/ / _` |\n" +
                "    \\  /\\  /  | | | | |_| |    \\  /\\  / (_) | | | |   < (_| |\n" +
                "     \\/  \\/   |_|_|_|\\__, |     \\/  \\/ \\___/|_| |_|_|\\_\\__,_|\n" +
                "                      __/ |                                  \n" +
                "                     |___/                                   \n");
    }

    public void popularDadosIniciais() {

        Fornecedor f1 = new Fornecedor("Lacta ME", "123456789012", "avenida das rosas, 222", "12 99999993");
        Fornecedor f2 = new Fornecedor("Amendoim Ltda", "998877664433", "Rua dos bobos, 0", "12 912333333");
        Fornecedor f3 = new Fornecedor("Comevap" , "1234333210", "Vista verde, 400", "12 432433211");

        dbFornecedor.salvar(f1);
        dbFornecedor.salvar(f3);
        dbFornecedor.salvar(f2);

        Produto p1 = new Produto("Amendoim", 10.0, 100, f2);
        Produto p2 = new Produto("Cacau", 12.5, 200, f1);
        Produto p3 = new Produto("Leite",5.0, 50, f3);
        dbProdutos.salvar(p1);
        dbProdutos.salvar(p2);
        dbProdutos.salvar(p3);


    }
    public void esperarEnter(){
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine(); // Limpa o buffer do println
        scanner.nextLine(); // Aguarda usuario
    }

}
