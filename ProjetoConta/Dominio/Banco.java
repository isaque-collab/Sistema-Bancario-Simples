package POO.ProjetoConta.Dominio;

import java.util.ArrayList;

public class Banco {

   private ArrayList<Conta> contas = new ArrayList<Conta>();


    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void listarContas(){
        for(Conta conta : contas){
            conta.exibirInformacoes();
        }
    }

    public Conta buscarConta(int numeroDaConta){

        for(Conta conta : contas){

            if(conta.getNumeroDaConta() == numeroDaConta){
                return conta;
            }
        }
        return null;
    }
}
