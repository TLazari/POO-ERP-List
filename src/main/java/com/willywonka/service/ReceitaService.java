package com.willywonka.service;

import com.willywonka.model.Fornecedor;
import com.willywonka.model.Produto;

import java.util.Scanner;

public class ReceitaService {
    private final ProdutoService receitaServices;

    public ReceitaService(ProdutoService produtoService) {
        this.receitaServices = produtoService;
    }

    public void produzirBarraDeChocolate() {
        System.out.println("Produzindo Barra de Chocolate...");

        Produto cacau = receitaServices.buscarPorNome("Cacau");
        Produto leite = receitaServices.buscarPorNome("Leite");

        if (cacau == null || leite == null) {
            System.out.println("Ingredientes faltando para produzir a barra.");
            return;
        }

        double qtdCacau = 50; // exemplo: 0.5kg de chocolate
        double qtdLeite = 20; // exemplo: 0.2kg de leite

        if (cacau.getQuantidade() < qtdCacau || leite.getQuantidade() < qtdLeite) {
            System.out.println("Quantidade insuficiente de ingredientes.");
            return;
        }

        // Dar baixa nos insumos
        cacau.setQuantidade(cacau.getQuantidade() - qtdCacau);
        leite.setQuantidade(leite.getQuantidade() - qtdLeite);

        // Criar novo produto final
        Produto barraDeChocolate = receitaServices.buscarPorNome("Barra de Chocolate");

        if (barraDeChocolate != null) {
            // Já existe o produto -> apenas aumentar a quantidade
            barraDeChocolate.setQuantidade(barraDeChocolate.getQuantidade() + 1);
            System.out.println("Barra de Chocolate já existia. Quantidade atualizada!");
        } else {
            // Não existe -> criar um novo produto
            barraDeChocolate = new Produto();
            barraDeChocolate.setNome("Barra de Chocolate");
            barraDeChocolate.setPreco(15.0); // preço de venda
            barraDeChocolate.setQuantidade(1);

            receitaServices.salvar(barraDeChocolate);
            System.out.println("Barra de Chocolate criada e adicionada ao estoque!");
        }

        System.out.println("Barra de Chocolate produzida com sucesso!");

        public void produzirSnicker() {
            System.out.println("Produzindo Snicker...");

            Produto cacau = receitaServices.buscarPorNome("Cacau");
            Produto amendoim = receitaServices.buscarPorNome("Amendoim");

            if (cacau == null || leite == null) {
                System.out.println("Ingredientes faltando para produzir a barra.");
                return;
            }

            double qtdCacau = 50; // exemplo: 0.5kg de chocolate
            double qtdLeite = 20; // exemplo: 0.2kg de leite

            if (cacau.getQuantidade() < qtdCacau || leite.getQuantidade() < qtdLeite) {
                System.out.println("Quantidade insuficiente de ingredientes.");
                return;
            }

            // Dar baixa nos insumos
            cacau.setQuantidade(cacau.getQuantidade() - qtdCacau);
            leite.setQuantidade(leite.getQuantidade() - qtdLeite);

            // Criar novo produto final
            Produto barraDeChocolate = receitaServices.buscarPorNome("Barra de Chocolate");

            if (barraDeChocolate != null) {
                // Já existe o produto -> apenas aumentar a quantidade
                barraDeChocolate.setQuantidade(barraDeChocolate.getQuantidade() + 1);
                System.out.println("Barra de Chocolate já existia. Quantidade atualizada!");
            } else {
                // Não existe -> criar um novo produto
                barraDeChocolate = new Produto();
                barraDeChocolate.setNome("Barra de Chocolate");
                barraDeChocolate.setPreco(15.0); // preço de venda
                barraDeChocolate.setQuantidade(1);

                receitaServices.salvar(barraDeChocolate);
                System.out.println("Barra de Chocolate criada e adicionada ao estoque!");
            }

            System.out.println("Barra de Chocolate produzida com sucesso!");
        }
    }
}
