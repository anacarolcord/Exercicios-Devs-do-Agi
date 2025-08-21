package br.com.devsdoagi.ClassesAbstratas.Exercicio01;

public class ContaCorrente extends Conta{

    public ContaCorrente(String numeroConta, double saldo){
        super(numeroConta,saldo);
    }

    public void atualizarMensal(){
        double resultado = this.saldo-15;
        System.out.println("Saldo de "+this.saldo+" da conta "+numeroConta+" com desconto de R$15,00 de taxa: R$"+resultado);
    }

}
