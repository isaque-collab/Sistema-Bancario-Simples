# 🏦 Sistema Bancário em Java

Projeto desenvolvido para praticar os fundamentos de Programação Orientada a Objetos (POO) em Java.

## 📋 Sobre o Projeto

Simulação de um sistema bancário simples via terminal, onde é possível criar contas, realizar depósitos, saques e listar os clientes cadastrados no banco.

## 🚀 Funcionalidades

- Criar Conta Corrente (com limite)
- Criar Conta Poupança (com taxa de rendimento)
- Depositar em uma conta (com ou sem descrição)
- Sacar de uma conta
- Listar todas as contas cadastradas

## 🧱 Conceitos de POO Aplicados

| Conceito | Onde foi aplicado |
|---|---|
| **Encapsulamento** | Atributos `private` com getters e setters em todas as classes |
| **Construtores** | Todas as classes possuem construtores próprios |
| **Bloco de inicialização** | Classe `Conta` exibe mensagem ao instanciar qualquer conta |
| **Sobrecarga** | Método `depositar` aceita com ou sem descrição |
| **Herança** | `ContaCorrente` e `ContaPoupanca` herdam de `Conta` |
| **ArrayList** | Classe `Banco` gerencia as contas com `ArrayList<Conta>` |

## 🗂️ Estrutura do Projeto

```
src/
└── POO/
    └── ProjetoConta/
        ├── Dominio/
        │   ├── Conta.java
        │   ├── ContaCorrente.java
        │   ├── ContaPoupanca.java
        │   └── Banco.java
        └── Main/
            └── Main.java
```

## ▶️ Como Executar

1. Clone o repositório
2. Abra o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code)
3. Execute a classe `Main.java`
4. Interaja com o menu no terminal

## 💻 Exemplo de Uso

```
------------------BANCO--------------------------
1 - Criar Conta Corrente
2 - Criar Conta Poupança
3 - Depositar
4 - Sacar
5 - Listar Contas
0 - Sair
Escolha uma opcao:
```

## 🛠️ Tecnologias

- Java
- Paradigma Orientado a Objetos

---

Desenvolvido por Isaque como projeto de aprendizado de POO em Java.
