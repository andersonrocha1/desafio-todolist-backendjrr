                              
                            
# TodoList

#### API para gerenciar tarefas (CRUD) que faz parte desse desafio para pessoas desenvolvedoras backend júnior e colocando em prática o que venho aprendendo.

## Índice
- <a href="#tecnologiasutilizadas">Tecnologias Utilizadas</a>
- <a href="#bancosutilizados">Banco de Dados</a>
- <a href="#praticas">Práticas adotadas</a>
- <a href="#padroesutilizados">Padrões do Projeto</a>
- <a href="#comoexecutar">Como Executar</a>
- <a href="#ondeacessar">Onde Acessar?</a>
- <a href="#contatos">Contatos</a>

## Tecnologias Utilizadas

  - [x] Java
  - [x] Spring Boot
  - [x] Spring MVC
  - [x] Spring Data JPA
  - [x] SpringDoc OpenAPI 3

## Banco de Dados

  - [x] Banco de dados H2 - Testes
  - [x] Banco de dados Postgres  


## Práticas adotadas
    * SOLID, DRY, YAGNI, KISS
    * API REST
    * Consultas com Spring Data JPA
    * Injeção de Dependências
    * Tratamento de respostas de erro
    * Geração automática do Swagger com a OpenAPI 3
    * Sistema em camadas
      

      
## Padrão de Projeto
  - API REST

  ### Padrão Camadas

![Camadas](https://user-images.githubusercontent.com/23089093/239023317-bf27fd4c-82b4-4a77-887d-3e88dd0d1511.png)


## Como executar

* Clonar repositório git

* Construir o projeto:

$ ./mvnw clean package

* Executar a aplicação:

$ java -jar target/todolist-0.0.1-SNAPSHOT.jar


## Onde acessar ?

- A API poderá ser acessada em localhost:8080. O Swagger poderá ser visualizado em localhost:8080/swagger-ui.html


## Endpoints

- Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta: - <a href="https://www.postman.com/downloads/?utm_source=postman-home">Postman</a>

* Criar Tarefa

```json
$ http POST http://localhost:8080/api/todos

{
    "nome": "Todo 1: README",
    "descricao": "Adicionar README ao repositório GitHub",
    "prioridade": 1,
    "realizado": false
      
}

```
    Resposta

```json
[
    {
        "id": 1,
        "nome": "Todo 1: README",
        "descricao": "Adicionar README ao repositório GitHub",
        "realizado": false,
        "prioridade": 1
    }
]

```

* Listar Tarefa


```json
$ http GET http://localhost:8080/api/todos
[
    {
        "id": 1,
        "nome": "Todo 1: README",
        "descricao": "Adicionar README ao repositório GitHub",
        "realizado": false,
        "prioridade": 1
    }
]

```
* Atualizar Tarefa

```json
$ http PUT http://localhost:8080/api/todos/1

{
    "nome": "Todo 1: README",
    "descricao": "Adicionar README ao repositório GitHub",
    "prioridade": 1,
    "realizado": true
      
}

```
  Resposta

```json
[
    {
        "id": 1,
        "nome": "Todo 1: README",
        "descricao": "Adicionar README ao repositório GitHub",
        "realizado": true,
        "prioridade": 1
    }
]

```

* Remover Tarefa

http DELETE http://localhost:8080/api/todos/1

  Resposta 

[]


## Contatos

* Links 

<a href= "https://www.linkedin.com/in/anderson-rocha-228231222/">Linkedin : Anderson</a>


