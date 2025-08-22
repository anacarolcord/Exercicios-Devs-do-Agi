package br.com.devsdoagi.HackatonSistemaBancario;

public abstract class Conta implements IOperacoesBancarias {
    private String numeroConta;
    private double saldo;
    private String titular;

    //Construtor explicito
    public Conta(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void depositar(double valor) {
        double deposito = saldo += valor;
        System.out.println("Deposito de R$" + valor + " na conta " + getNumeroConta() + " do titular " + getTitular() + "\nsaldo atual R$" + deposito);
    }

    public void sacar(double valor) {
        double saque;
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
           saque = saldo -= valor;
            System.out.println("Saque de R$" + valor + " da conta " + getNumeroConta() + " do titular " + getTitular() + "\nsaldo atual R$" + saque);
        }
    }

    public abstract void aplicarJuros();

}