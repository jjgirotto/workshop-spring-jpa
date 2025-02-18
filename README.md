# Sistema de Pedidos

Esta é uma aplicação utilizando Spring e JPA com o modelo da imagem abaixo:
![domain-model](https://github.com/user-attachments/assets/f734cc8a-89e0-4943-b2fd-e7df438b5273)

Permite gerenciar usuários e seus pedidos.

## Funcionalidades Principais

- Inserir, atualizar, procurar por id e deletar usuário;
- Inserir, atualizar, procurar por id e deletar pedidos.

## Requisitos

Certifique-se de ter as seguintes ferramentas instaladas:
- Java Development Kit (JDK) 17 ou superior;
- Maven 3.9.4 ou superior;
- Dependências de JPA, H2 e Spring Web.

## Instalação

Siga os passos abaixo para configurar o projeto no seu ambiente de execução:
1. **Clone o repositório**
```bash
git clone https://github.com/jjgirotto/workshop-spring-jpa.git
```
3. **Execute o projeto**

Para executar o projeto no IntelliJ, use `Alt + F10` ou Run as Java Project no Eclipse.

4. **Acesse o bando de dados**

Acesse no navegador ```localhost:8080/h2-console``` e utilize o Postman para testar requisições.

### Estrutura do Projeto

* `src/main/java/com/educandoweb/course`: código fonte principal;
* `src/main/java/com/educandoweb/course/services`: classes de serviços (categoria, pedido, produto e usuário) e exceções de serviço;
* `src/main/java/com/educandoweb/course/resources`: classes de recursos (categoria, pedido, produto, item do pedido e usuário) e exceções de recurso;
* `src/main/java/com/educandoweb/course/repositores`: classes de repositórios (categoria, pedido, produto, item do pedido e usuário); 
* `src/main/java/com/educandoweb/course/entities`: classes de entidades (categoria, pedido, produto, item do pedido, usuário e pagamento), também inclui enums e classe de Primary Key para OrderItem;
* `src/main/java/com/educandoweb/course/config`: classes para testes de configurações.

### Contato

Para dúvidas ou problemas, entre em contato com:
* Nome: Juliana Girotto
* Email: ads.jjgirotto@gmail.com
* GitHub: github.com/jjgirotto
