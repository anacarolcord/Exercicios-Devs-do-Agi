package br.com.devsdoagi.ClassesAbstratas.Exercicio01;

abstract class Conta {
    public String numeroConta;
    public double saldo;

    public Conta(String numeroConta, double saldo){
        this.numeroConta=numeroConta;
        this.saldo=saldo;
    }

    public abstract void atualizarMensal();

}
