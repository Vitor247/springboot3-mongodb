# Sobre o projeto

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Vitor247/springboot3-jpa/blob/main/LICENSE) 

Este projeto foi desenvolvido com o objetivo de aprender e praticar o uso de bancos de dados noSql no caso foi usado o MongoDB.
A API simula um pequeno sistema de blog, armazenando usuários, posts e comentários de forma não-relacional.

## Modelo conceitual
![Modelo Conceitual](https://github.com/Vitor247/assets/blob/main/springboot3-mongo/mongo-model.png)

## Tecnologias utilizadas
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- Postman
- Mongo local

## Como executar o projeto

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/Vitor247/springboot3-mongo

# entrar na pasta do projeto
cd springboot3-mongo

# executar o projeto
./mvnw spring-boot:run
```

## Endpoints da API

Coleção para importar no [postman](https://github.com/Vitor247/springboot3-mongodb/blob/main/Mongo.postman_collection.json).

| Método | Endpoint            | Função                             |
| :----: | ------------------- | ---------------------------------- |
|   GET  | `/users`            | Retorna todos os usuários          |
|   GET  | `/users/{id}`       | Retorna usuário por ID             |
|  POST  | `/users`            | Cadastra novo usuário              |
|   PUT  | `/users/{id}`       | Atualiza um usuário                |
| DELETE | `/users/{id}`       | Remove um usuário                  |
|   GET  | `/users/{id}/posts` | Lista todos os posts de um usuário |


| Método | Endpoint                                    | Função                                            |
| :----: | ------------------------------------------- | ------------------------------------------------- |
|   GET  | `/posts/{id}`                               | Retorna post com comentários                      |
|   GET  | `/posts/titlesearch?text=...`               | Busca posts pelo título contendo texto            |
|   GET  | `/posts/fullsearch?text=&minDate=&maxDate=` | Busca com filtro por palavra e intervalo de datas |


# Autor

Vitor Camilo Inácio

https://www.linkedin.com/in/vitorcamilo-dev
