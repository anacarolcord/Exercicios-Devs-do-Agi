package br.com.devsdoagi.ClassesAbstratas.Exercicio01;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numeroConta, double saldo){
        super(numeroConta,saldo);
    }

    public void atualizarMensal(){
        double resultado = this.saldo*0.005;
        resultado+=this.saldo;

        System.out.println("Saldo de "+this.saldo+" da conta "+this.numeroConta+" com aumento de 0,5%: R$"+resultado);
    }
}
