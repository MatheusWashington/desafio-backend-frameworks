# Desafio Multi-Framework no GitHub
---
## Introdução
---
Este repositório foi desenvolvido como parte de uma atividade prática com o objetivo de demonstrar conhecimentos em arquitetura em camadas (MVC) e utilização de diferentes frameworks back-end.

O projeto contém duas implementações distintas:

node-express -> utilizando Node.js com Express
java-springboot-> utilizando Java com Spring Boot

---
##Estrutura do Projeto
---
desafio-backend-frameworks/
│
├── node-express/
│   ├── models/
│   ├── controllers/
│   ├── routes/
│
├── java-springboot/
│   └── src/main/java/.../
│       ├── model/
│       ├── controller/
│       └── service/
│
└── README.md

---
## Arquitetura Utilizada (MVC)
---
A arquitetura utilizada foi a Model-View-Controller (MVC).

### Model
Responsável pela representação dos dados da aplicação.

`UserModel`

### Controller
Responsável por receber as requisições e retornar respostas.

`UserController`

### Router/Service
Node.js -> utiliza routes para direcionar as requisições

Spring Boot -> pode utilizar camada de service para lógica de negócio

---
## Comparação entre Frameworks
---
### Node.js + Express
#### Vantagens:

- Configuração mais simplificada e rápida
- Menos verboso

#### Desvantagens:

- Menos estruturado por padrão
- Gera muitas outras pastas que em algum momento trouxe alguma confusão

### Java + Spring Boot

#### Vantagens:

- Estrutura bem definida
- A princípio mais difícil de configurar que o Node.js

#### Desvantagens:

- Mais verboso
- Configuração inicial mais complexa

---
## Conclusão
---

Ambos os frameworks são eficientes para desenvolvimento back-end, porém possuem propostas diferentes:

Node.js/Express → mais simples e rápido para começar

Spring Boot → mais robusto e indicado para sistemas maiores

---
## Tecnologias Utilizadas
---

Node.js
Express
Java
Spring Boot

---
## Repositório
---

https://github.com/MatheusWashington/desafio-backend-frameworks

---
## Autor
---
Nome: Matheus Washington Clementino de Almeida
Matrícula: 01808754
Curso: Análise e Desenvolvimento de Sistemas
Disciplina: Back-end e Frameworks 
