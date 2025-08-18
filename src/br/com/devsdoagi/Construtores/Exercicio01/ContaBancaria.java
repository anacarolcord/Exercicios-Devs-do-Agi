package br.com.devsdoagi.Construtores.Exercicio01;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(){
        this.titular=" ";
        this.numeroConta=" ";

    }

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public ContaBancaria(String titular, String numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirConta(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Numero da conta: "+this.numeroConta);
        System.out.println("Saldo: "+this.saldo);
    }



}
