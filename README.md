# Spring Boot Biblioteca Backend

O `spring-boot-biblioteca-backend` é um sistema de backend desenvolvido com Spring Boot, projetado para exemplificar o controle eficiente de operações de biblioteca. Este sistema facilita a gestão de livros, empréstimos, devoluções e registros de usuários, proporcionando uma interface robusta e fácil de usar para bibliotecários e membros.

## Funcionalidades

- **Cadastro de Livros**: Adicione, atualize e remova livros no catálogo da biblioteca.
- **Gerenciamento de Usuários**: Cadastre usuários e gerencie suas informações.
- **Controle de Empréstimos**: Registre empréstimos de livros aos usuários e acompanhe a data de devolução.
- **Histórico de Operações**: Mantenha um registro de todas as operações realizadas, incluindo empréstimos, devoluções e alterações no catálogo.

## Tecnologias Utilizadas

- **Spring Boot**: Para a criação de um backend robusto e de fácil manutenção.
- **Spring Data JPA**: Para interação simplificada com o banco de dados através de JPA.
- **H2 Database**: Um banco de dados em memória para testes e desenvolvimento rápido.
- **Spring Security**: Para autenticação e autorização, garantindo a segurança do sistema.

## Como Configurar e Rodar

### Pré-Requisitos

- JDK 11 ou superior
- Maven

### Passos para Configuração

1. Clone o repositório:

   ```
   git clone https://github.com/seu-usuario/spring-boot-biblioteca-backend.git
   ```

2. Navegue até a pasta do projeto:

   ```
   cd spring-boot-biblioteca-backend
   ```

3. Execute o projeto com Maven:

   ```
   mvn spring-boot:run
   ```

Após esses passos, o backend estará rodando localmente e acessível via `localhost:8080`.

## Documentação da API

A documentação detalhada dos endpoints da API e seus respectivos métodos está disponível em: `/swagger-ui.html` (após iniciar o aplicativo).

## Contribuindo

Sua contribuição é bem-vinda! 
