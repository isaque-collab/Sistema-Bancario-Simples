package POO.ProjetoConta.Main;

import POO.ProjetoConta.Dominio.Banco;
import POO.ProjetoConta.Dominio.Conta;
import POO.ProjetoConta.Dominio.ContaCorrente;
import POO.ProjetoConta.Dominio.ContaPoupanca;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do{
            System.out.println("\n------------------BANCO-------------------------- ");
            System.out.println("1 - Criar Conta Corrente");
            System.out.println("2 - Criar Conta Poupança");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Listar Contas");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();
            input.nextLine();

            switch(opcao){
                case 1:
                    System.out.print("Digite o nome do titular: ");
                    String titularCC = input.nextLine();
                    System.out.print("Digite o número da conta: ");
                    int numeroCC = input.nextInt();
                    System.out.print("Digite o saldo inicial da conta: ");
                    double saldoCC = input.nextDouble();
                    System.out.print("Limite da conta: ");
                    double limiteCC = input.nextDouble();

                    ContaCorrente cc = new ContaCorrente(numeroCC,titularCC,saldoCC,limiteCC);

                    banco.adicionarConta(cc);

                    System.out.println("Conta adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do titular: ");
                    String titularCP = input.nextLine();
                    System.out.print("Digite o número da conta: ");
                    int numeroCP = input.nextInt();
                    System.out.print("Digite o saldo inicial da conta: ");
                    double saldoCP = input.nextDouble();
                    System.out.print("Taxa de Rendimento: ");
                    double taxaCP = input.nextDouble();

                    ContaPoupanca cp = new ContaPoupanca(numeroCP,titularCP,saldoCP,taxaCP);
                    banco.adicionarConta(cp);
                    System.out.println("Conta adicionado com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite o número da conta: ");
                    int numeroDeposito  = input.nextInt();
                    System.out.print("Quanto deseja depositar: ");
                    double valorDeposito = input.nextDouble();

                    Conta contaDeposito = banco.buscarConta(numeroDeposito);
                    if (contaDeposito != null){
                        contaDeposito.depositar(valorDeposito);
                        System.out.println("Depósito realizado com sucesso");
                    }else {
                        System.out.println("Conta não encontrada");
                    }

                    break;
                case 4:
                    System.out.print("Digite o número da conta: ");
                    int numeroSaque = input.nextInt();
                    System.out.print("Quanto deseja sacar: ");
                    double valorSaque = input.nextDouble();

                    Conta contaSaque = banco.buscarConta(numeroSaque);
                    if (contaSaque != null){
                        contaSaque.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso");
                    }else{
                        System.out.println("Conta não encontrada");
                    }
                    break;

                case 5:
                    banco.listarContas();
                    break;

                case 0:
                    System.out.println("Sistema encerrado!");

                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao !=0 );

        input.close();
    }
}
