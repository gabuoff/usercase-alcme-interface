# Backend Application

## Descrição da aplicação

Bem vindo ao backend, uma aplicação construída usando Spring Boot e MongoDB. A aplicação segue a arquitetura Clean Architecture, que promove a separação de responsabilidades e a independência das camadas, facilitando a manutenção e evolução do sistema.

A arquitetura é organizada em camadas com os seguintes pacotes:

![Alt text](docs/clean_architecture.png?raw=true "Clean Architecture Cone")

- `businessrule`: Contém os casos de uso (use cases) e regras de negócio da aplicação. Inclui pacotes como `exception` para exceções personalizadas, `message` para serviços de mensagem específicos das regras de negócio, `usecase` para implementações de casos de uso e `validator` para validações personalizadas.

- `domain`: Contém as entidades do domínio, que representam os objetos centrais da sua lógica de negócio.

- `external`: Contém itens relacionados à parte mais externa da aplicação, como configurações gerais. Por exemplo, você pode ter um pacote `configuration` para configurações da aplicação.

- `interfaceadapter`: Contém os itens relacionados ao acesso do usuário à aplicação. `repository` para acessar e obter dados do banco de dados


## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em seu ambiente de desenvolvimento:

- JDK 17 (Java Development Kit)
- Maven 3.9.2
- MongoDB
- MongoDB-Compass

É possivel acessar via docker mas talvez seja necessario mexer no application.properties


## Configuração do Banco de Dados

Este projeto utiliza o MongoDB como banco de dados. Para configurar o MongoDB em seu ambiente local, você pode utilizar o MongoDBCompass `https://www.mongodb.com/try/download/community-kubernetes-operator`

## Executando a Aplicação

Siga as etapas abaixo para executar a aplicação:

1. Certifique-se de que o MongoDB esteja em execução.
2. Abra um terminal ou prompt de comando.
3. Navegue até o diretório raiz do projeto.
4. Execute o comando `mvn spring-boot:run` para iniciar a aplicação.

A aplicação será iniciada e estará disponível em `http://localhost:8080`.

## TDD - Test Driven Development

Para a vizualização de cobertura de testes foi utilizado o Jacoco, o arquivo é gerado no caminho target/site assim que usado o comando

- Foi utilizado o JUNIT para a cobertura de testes

- Rodar os testes, use: `mvn test`


## Contato

Se tiver alguma dúvida ou precisar de assistência adicional, entre em contato pelo e-mail gabrielmeloc@gmail.com.

Espero que esta estrutura e o README atendam às suas necessidades! Se você tiver mais alguma dúvida ou precisar de mais informações, fique à vontade para perguntar.
