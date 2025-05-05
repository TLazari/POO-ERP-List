
# 🍫 Willy Wonka ERP – Sistema de Gestão de Produção e Estoque

Este projeto é uma implementação didática de um sistema ERP (Enterprise Resource Planning) desenvolvido em Java, utilizando os princípios de Programação Orientada a Objetos (POO). O sistema é voltado para a gestão de uma fábrica fictícia de chocolates chamada **Willy Wonka**, abrangendo os módulos de **Estoque**, **Produtos** e **Produção**.

## 🎯 Objetivo

Demonstrar a aplicação de conceitos de POO na construção de um sistema ERP modular, com foco na gestão de processos industriais e controle de estoque.

## 🧱 Estrutura do Projeto

O projeto está organizado da seguinte forma:

* **`src/`**: Contém o código-fonte principal, organizado em pacotes que representam diferentes módulos do sistema:

  * **`com.willywonka.estoque`**: Gerencia o controle de estoque de matérias-primas e produtos acabados.
  * **`com.willywonka.produto`**: Define as classes relacionadas aos produtos fabricados, incluindo suas características e métodos associados.
  * **`com.willywonka.producao`**: Responsável pelo controle do processo de produção, incluindo ordens de produção e consumo de matérias-primas.

* **`pom.xml`**: Arquivo de configuração do Maven, utilizado para gerenciar as dependências e o ciclo de vida do projeto.

## 🚀 Tecnologias Utilizadas

* Java 17
* Maven para gerenciamento de dependências
* Programação Orientada a Objetos (POO)

## 📦 Funcionalidades

* Cadastro e gerenciamento de produtos e matérias-primas
* Controle de estoque com atualização automática após processos de produção
* Registro de ordens de produção e consumo de insumos
* Geração de relatórios simples para acompanhamento de estoque e produção

## 🛠️ Como Executar

1. Clone o repositório:

   ```bash
   git clone https://github.com/TLazari/POO-ERP-List.git
   ```



2. Navegue até o diretório do projeto:

   ```bash
   cd POO-ERP-List
   ```



3. Compile o projeto utilizando o Maven:

   ```bash
   mvn clean install
   ```



4. Execute a aplicação:

   ```bash
   mvn exec:java -Dexec.mainClass="com.willywonka.Main"
   ```



## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
