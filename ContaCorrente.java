package POO.ProjetoConta.Dominio;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numeroDaConta, String titular, double saldo, double limite) {

        super(numeroDaConta, titular, saldo);
        this.limite = limite;

    }

    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }


    @Override
    public void sacar(double valor) {

        double maximoPermitido = getSaldo() + limite;

        if (valor > maximoPermitido) {

            System.out.println("O valor que deseja sacar é maior que o limite disponível.");
            return;
        }

        setSaldo(getSaldo() - valor);

        System.out.println("Saque realizado!");
    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Limite da conta: " + limite);
    }

}
