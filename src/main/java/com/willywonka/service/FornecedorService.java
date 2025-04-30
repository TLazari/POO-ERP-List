package com.willywonka.service;

import com.willywonka.model.Fornecedor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class FornecedorService implements CRUDService<Fornecedor> {
    private final List<Fornecedor> fornecedores = new ArrayList<>();
    private int currentId = 1;
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public List<Fornecedor> listar() {
        return fornecedores;
    }

    @Override
    public void salvar(Fornecedor fornecedor) {
        fornecedor.setId(currentId++);
        fornecedores.add(fornecedor);
    }

    @Override
    public void excluir(int id) {
        fornecedores.removeIf(fornecedor -> fornecedor.getId() == id);
    }

    @Override
    public Fornecedor buscarPorId(int id) {
        Optional<Fornecedor> fornecedor = fornecedores.stream()
                .filter(f -> f.getId() == id)
                .findFirst();
        return fornecedor.orElse(null);
    }

    //Utilitários pelo Menu (INPUT E OUTPUT)

    //Cadastro do Fornecedor e será atribuido um ID
    public void adicionarFornecedor() {
        System.out.println("Digite o nome do Fornecedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o CNPJ:");
        String cnpj = scanner.nextLine();

        System.out.println("Digite o endereço:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();

        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setNome(nome);
        fornecedor.setCnpj(cnpj);
        fornecedor.setEndereco(endereco);
        fornecedor.setTelefone(telefone);

        this.salvar(fornecedor);

        System.out.println("Fornecedor adicionado com sucesso!");
    }

    //Edição do Fornecedor através do ID
    public void editarFornecedor() {
        System.out.println("Digite o ID do fornecedor que deseja editar:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n

        Fornecedor fornecedorEncontrado = buscarPorId(id);

        if (fornecedorEncontrado != null) {
            System.out.println("Fornecedor encontrado: " + fornecedorEncontrado.getNome());

            System.out.println("Digite o novo nome do fornecedor (ou pressione Enter para manter o nome atual):");
            String novoNome = scanner.nextLine();
            if (!novoNome.isEmpty()) {
                fornecedorEncontrado.setNome(novoNome);
            }

            System.out.println("Digite o novo cnpj (ou pressione Enter para manter o cnpj atual):");
            String novoCnpjInput = scanner.nextLine();
            if (!novoCnpjInput.isEmpty()) {
                fornecedorEncontrado.setCnpj(novoCnpjInput);
            }

            System.out.println("Digite o novo endereço (ou pressione Enter para manter o endereço atual):");
            String novoEndereco = scanner.nextLine();
            if (!novoEndereco.isEmpty()) {
                fornecedorEncontrado.setEndereco(novoEndereco);
            }

            System.out.println("Digite o novo telefone (ou pressione Enter para manter o telefone atual):");
            String novoTelefone = scanner.nextLine();
            if (!novoTelefone.isEmpty()) {
                fornecedorEncontrado.setTelefone(novoTelefone);
            }

            System.out.println("Fornecedor atualizado com sucesso!");
        } else {
            System.out.println("Fornecedor com ID " + id + " não encontrado.");
        }
    }

    //Excluir um Fornecedor através do ID
    public void excluirFornecedor() {
        System.out.println("Digite o ID do fornecedor que deseja excluir:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir o \n

        Fornecedor fornecedorEncontrado = buscarPorId(id);

        if (fornecedorEncontrado != null) {
            fornecedores.remove(fornecedorEncontrado);
            System.out.println("Fornecedor excluído com sucesso!");
        } else {
            System.out.println("Fornecedor com ID " + id + " não encontrado.");
        }
    }

}
