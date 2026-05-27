# 📚 Alexandria - Library Management System

Bem-vindo ao repositório do **Alexandria**, um sistema de gerenciamento de biblioteca desenvolvido como uma API RESTful utilizando o ecossistema Spring Boot. 

O objetivo deste projeto é fornecer uma interface para o gerenciamento de livros (Books), autores (Authors), editoras (Publishers) e detalhes dos livros (BookDetails).

---

## 🚀 Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias e ferramentas:

- **Java 23**: Versão da linguagem de programação.
- **Spring Boot 3.4.3**: Framework principal para a construção da API.
- **Spring Data JPA & Hibernate**: Para mapeamento objeto-relacional (ORM) e interação com o banco de dados.
- **MySQL**: Banco de dados relacional.
- **Maven**: Gerenciador de dependências e build do projeto.

---

## 🏗️ Arquitetura do Projeto

O sistema foi desenhado com base em uma arquitetura em camadas, separando as responsabilidades para facilitar a manutenção e escalabilidade:

- **Controllers** (`com.br.library.controller`): Responsáveis por receber as requisições HTTP e retornar as respostas adequadas. Utiliza DTOs para tráfego de dados.
- **Services** (`com.br.library.service`): Contém a regra de negócio da aplicação.
- **Repositories** (`com.br.library.repository`): Interfaces do Spring Data JPA para comunicação com o banco de dados.
- **Entities** (`com.br.library.entity`): Classes que representam as tabelas do banco de dados.
- **DTOs** (`com.br.library.controller.dto`): Padrão de projeto *Data Transfer Object* usado para transferir dados entre a camada de controle e os clientes da API, protegendo as entidades do banco de dados.
- **Advice/Exceptions** (`com.br.library.advice` e `com.br.library.exception`): Manipulação global de exceções para padronizar os erros retornados pela API.

---

## 🗂️ Modelagem de Dados e Relacionamentos

O domínio da aplicação gira em torno da entidade `Book` (Livro) e seus relacionamentos:

- **Book ↔ BookDetail**: Relacionamento de `1 para 1` (OneToOne). Cada livro possui um detalhe específico.
- **Book ↔ Publisher**: Relacionamento de `Muitos para 1` (ManyToOne). Vários livros podem pertencer a uma mesma editora.
- **Book ↔ Author**: Relacionamento de `Muitos para Muitos` (ManyToMany). Um livro pode ter vários autores, e um autor pode escrever vários livros.

---

## ⚙️ Configuração e Execução

### Pré-requisitos

Para rodar este projeto na sua máquina, você vai precisar do seguinte instalado:
- **Java 23** (JDK)
- **MySQL Server**
- **Maven** (Opcional, pois o projeto usa o Maven Wrapper `mvnw`)

### Configuração do Banco de Dados

1. Certifique-se de que o MySQL está rodando na sua máquina na porta padrão `3306`.
2. O sistema espera as seguintes credenciais padrão (que podem ser alteradas no arquivo `src/main/resources/application.properties`):
   - **Database**: `alexandriadb` (Será criado automaticamente se não existir)
   - **Usuário**: `root`
   - **Senha**: `root`

### Rodando o Projeto

1. Clone este repositório:
   ```bash
   git clone <url-do-repositorio>
   cd Library
   ```

2. Execute o projeto usando o Maven Wrapper:

   **No Windows:**
   ```cmd
   mvnw spring-boot:run
   ```

   **No Linux/Mac:**
   ```bash
   ./mvnw spring-boot:run
   ```

3. A API estará disponível em `http://localhost:8080`.

---

## 🌱 Seed do Banco de Dados

O projeto conta com uma inicialização automática de dados para facilitar os testes em ambiente de desenvolvimento:
- O arquivo `import.sql` insere registros iniciais de livros de história diretamente via script SQL.
- A classe `DatabaseSeeder.java` (implementando `CommandLineRunner`) também cadastra livros iniciais utilizando o `BookRepository` ao subir a aplicação.

---

## 📄 Licença

Este projeto é apenas para fins de demonstração e estudos de Spring Boot com JPA. Sinta-se à vontade para modificar, contribuir e utilizar o código.
