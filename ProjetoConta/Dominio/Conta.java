package POO.ProjetoConta.Dominio;

public class Conta {
    private int numeroDaConta;
    private String titular;
    private double saldo;
    {
        System.out.println("Nova Conta Criada");
    }
    public Conta(int numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void depositar(double valor){
        if(valor<0){
            System.out.println("Valor inválido para depositar");
            return;
        }
        this.saldo += valor;
    }

    public void depositar(double valor, String descricao){

        this.depositar(valor);
        if (valor<0){
            return;
        }
        String descricaoDoDeposito = descricao;
        System.out.println("Descricao do Deposito: " + descricaoDoDeposito);

    }

    public void sacar(double valor){
        if(saldo < valor){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

    public void exibirInformacoes(){
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da Conta: " + this.numeroDaConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
