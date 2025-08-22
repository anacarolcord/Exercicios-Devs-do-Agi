package br.com.devsdoagi.HackatonSistemaBancario;

public class ContaCorrente extends Conta  {

    //construtor com heranca dos atributos da classe pai
    public ContaCorrente(String numeroConta,double saldo, String titular){
        super(numeroConta,saldo,titular);
    }

    //implementando metodo abstrato da classe pai
    @Override
    public void aplicarJuros(){
        System.out.println("Juros não aplicado ao saldo R$"+getSaldo()+" da conta nº "+getNumeroConta()+" referente ao titular "+getTitular()+"\ndevido ao tipo de conta ser Conta Corrente!");

    }








}
