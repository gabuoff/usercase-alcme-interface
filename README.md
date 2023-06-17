# Aplicação Clientela Alcme UserCases

Prezados esta é um aplicação full-stack de cadastro,desenvolvido principalmente com Angular, SpringBoot e MongoDB. Permite que os usuários cadastrem informações pessoais, como nome, e-mail e telefone.

A pasta `backend` fica a API do Spring,para que o Crud desenvolvido com Angular, na pasta `frontend` consuma.

## Clean Archtecture

Durante o desenvolvimento levei em consideração pontos importantes do Clean Archtecture, Clean Code e TDD

## Funcionalidades
 - Cadastro de usuário: os usuários podem preencher um formulário com seu nome, e-mail e telefone e realizar o cadastro.
 - Validação de formulário: o formulário possui validação de campos obrigatórios.
 - Tela de exibição de lista com todos os clientes cadastrados
 - Exibição de mensagem de erro: se ocorrer algum erro durante o cadastro, uma mensagem de erro será exibida.
 - Exibição de mensagem de sucesso: após o cadastro ser realizado com sucesso, uma mensagem de sucesso será exibida.


## Pré-requisitos

 - NODEjs
 - MAVEN 3.8
 - JDK 17~
 - MongoDBCompass

 
 ## Lembretes

 - Leia os readme em cada arquivo, ira resumir um pouco do projeto e lhe mostrar como inicializa-lo
 - Siga a ordem de inicialização, MongoDbCompass >  Backend > Frontend
 - No MongoDBCompass, lembresse de utilizar a conexão localhost 27017 sem user e pwd
 - Para iniciar o backend ./mvnw spring-boot:run ou mvn spring-boot:run
 - Para iniciar o frontend npm start ou ng serve
  