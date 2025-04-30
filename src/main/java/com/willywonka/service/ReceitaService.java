package com.willywonka.service;

import com.willywonka.model.Produto;

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

        double qtdCacau = 50; // 0.5kg de chocolate
        double qtdLeite = 20; // 0.2L de leite

        if (cacau.getQuantidade() < qtdCacau || leite.getQuantidade() < qtdLeite) {
            System.out.println("Não foi possível produzir.");
            if (cacau.getQuantidade() < qtdCacau){
                System.out.println("Voce não possui " + cacau.getNome() + " o suficiente.");
            }else {
                System.out.println("Voce não possui " + leite.getNome() + " o suficiente.");
            };
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

        System.out.println("Producao concluida com sucesso!");
    }

    public void produzirSnicker() {
        System.out.println("Produzindo Snicker...");

        Produto cacau = receitaServices.buscarPorNome("Cacau");
        Produto amendoim = receitaServices.buscarPorNome("Amendoim");

        if (cacau == null || amendoim == null) {
                System.out.println("Adicione os ingredientes para produzir o Snicker. (Cacau e Amendoim)");
                return;
            }

            double qtdCacau = 20; // 2kg de cacau
            double qtdAmendoim = 8; // 800gr de Amendoim

            if (cacau.getQuantidade() < qtdCacau || amendoim.getQuantidade() < qtdAmendoim) {
                System.out.println("Não foi possível produzir.");
                if (cacau.getQuantidade() < qtdCacau){
                    System.out.println("Voce não possui " + cacau.getNome() + " o suficiente.");
                } else {
                    System.out.println("Voce não possui " + amendoim.getNome() + " o suficiente.");}
                return;
            }

            // Dar baixa nos insumos
            cacau.setQuantidade(cacau.getQuantidade() - qtdCacau);
            amendoim.setQuantidade(amendoim.getQuantidade() - qtdAmendoim);

            // Criar novo produto final
            Produto snicker = receitaServices.buscarPorNome("Snicker");

            if (snicker != null) {
                // Já existe o produto -> apenas aumentar a quantidade
                snicker.setQuantidade(snicker.getQuantidade() + 1);
                System.out.println("Snicker já existia. Quantidade atualizada!");
            } else {
                // Não existe -> criar um novo produto
                snicker = new Produto();
                snicker.setNome("Snicker");
                snicker.setPreco(5.50); // preço de venda
                snicker.setQuantidade(1);

                receitaServices.salvar(snicker);
                System.out.println("Snicker criado e adicionada ao estoque!");
            }

            System.out.println("Producao concluida com sucesso!");
        }
    }


