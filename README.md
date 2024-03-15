# Projeto de Web Services em Java com Spring Boot e JPA/Hibernate
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Andersonlsilvas/Project_Springboot_JPA_Maven/tree/main) 

Este projeto implementa um conjunto de Web Services em Java utilizando o framework Spring Boot, integrado com JPA/Hibernate para persistência de dados. Projeto construido durante o Curso de Java com o Professor Nelio Alves. 

## Funcionalidades

- Implementação do modelo de domínio com as seguintes entidades: Pedido, Usuário, Produto, Categoria, Pagamento, Status do Pedido e Item do Pedido.
- Estruturação das camadas lógicas: Resource (recursos), Service (serviços) e Repository (repositórios).
- Configuração de um banco de dados de teste utilizando H2.
- Povoamento automático do banco de dados com dados iniciais.
- Implementação de operações CRUD (Create, Retrieve, Update, Delete) para cada entidade do modelo de domínio.
- Tratamento de exceções para garantir a integridade e segurança das operações.

## Modelos de Domínio

<img width="1361" alt="logical Layer" src="https://github.com/Andersonlsilvas/fotos/assets/113280312/f518ada0-1120-42a6-af51-d114ef825196">

<img width="1361" alt="Domain model" src="https://github.com/Andersonlsilvas/fotos/assets/113280312/e2b78c4d-9096-4554-89f0-3fd08a9b6562">

<img width="1361" alt="Domain Instance" src="https://github.com/Andersonlsilvas/fotos/assets/113280312/928ee54e-53bf-44ce-9ba6-9a78a14c01d2">

## Camadas Lógicas

### Recurso (Resource)
- Responsável por expor os endpoints RESTful para manipulação dos recursos (entidades) do sistema.

### Serviço (Service)
- Contém a lógica de negócio da aplicação.
- Coordena as operações entre os recursos e os repositórios.

### Banco de Dados (Repository)
- Responsável por realizar a persistência e recuperação dos dados no banco de dados.


## Tecnologias utilizadas

- Java 17
- Spring Boot 3
- JPA / Hibernate
- Maven 4.0


## Pré-requisitos

- Java JDK 17 ou superior instalado
- Maven instalado
- IDE de sua preferência (recomendado: Eclipse)

# Autor

Anderson Luis Silva dos Santos

https://www.linkedin.com/in/anderson-santos-32a102292
