package br.com.devsdoagi.HackatonSistemaBancario;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numeroConta,double saldo, String titular){
        super(numeroConta,saldo,titular);
    }

    @Override
    public void aplicarJuros(){
        //Metodo abastrato aplcar juros não atualiza saldo da conta após aplicar juros
        System.out.println("Juros de 1% aplicado ao saldo de R$"+getSaldo()+" da conta nº"+getNumeroConta()+"\nreferente ao titular "+getTitular()+" saldo atual com juros aplicado R$"+(getSaldo()*1.01));

    }

}
