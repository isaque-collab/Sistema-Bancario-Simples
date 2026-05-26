package POO.ProjetoConta.Dominio;

public class ContaPoupanca extends Conta {
    private double taxaDeRendimento;

    public ContaPoupanca(int numeroDaConta, String titular, double saldo, double taxaDeRendimento) {
        super(numeroDaConta, titular, saldo);
        this.taxaDeRendimento = taxaDeRendimento;
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }
    public void setTaxaDeRendimento(double taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }


    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Taxa de Rendimento: " + taxaDeRendimento);
    }
}
