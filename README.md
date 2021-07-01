# :standing_person:  Cadastro de Pessoas :standing_woman:

#### CREATE
#### READ
#### UPDATE
#### DELETE

## Ferramentas utilizadas para criar o projeto:

- [Postman] (https://www.postman.com/downloads/)
- [Intellij] (https://www.jetbrains.com/pt-br/idea/download/#section=windows)
- [MySql Workbench] (https://dev.mysql.com/downloads/workbench/)
- Git - [Windows] (https://git-scm.com/download/win)
- Kotlin
- Spring Boot


## Extrutura:
#### Application:
- GerenciamentoApplication

#### Controller:
- PersonController

#### Entity:
- PersonEntity

#### Repository:
- PersonRepository

#### DTO:
- MensagemDTO
- PersonDTO

## Payload / Body

#### Create
<details>
  <summary>POST - http://localhost:8080/person</summary>

```
{
    "nome" : "Pedro Henrique",
    "email" : "PedroH@gmail.com",
    "idade" : 20,
    "dataNascimento" : "2001-05-12"
}
```
</details>

#### Read
<details>
  <summary>GET - http://localhost:8080/person</summary>
</details>

#### Read for Id
<details>
  <summary>GET - http://localhost:8080/person/1</summary>
</details>

#### Update
<details>
  <summary>PUT - http://localhost:8080/person/1</summary>

```
{
    "nome" : "Pedro Henrique Almeida",
    "email" : "PedroHAlmeida@gmail.com",
    "idade" : 21,
    "dataNascimento" : "2001-05-12"
}
```
</details>

#### Delete
<details>
  <summary>DELETE - http://localhost:8080/person/1</summary>
</details>

## Bibliotecas Utilizadas: 

- MySQL Connector/J
- Spring Web
- Spring Boot Starter Data JPA
- Spring Boot DevTools
- Hibernate Validator
