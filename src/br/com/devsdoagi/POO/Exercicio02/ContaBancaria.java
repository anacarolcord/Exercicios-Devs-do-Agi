package br.com.devsdoagi.POO.Exercicio02;

import javax.sound.midi.Soundbank;

public class ContaBancaria {

    public String titular;
    public String numeroConta;
    public double saldo;

    public ContaBancaria(){
        this.titular= "Ana Carolina";
        this.numeroConta= "00876-6";
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }

    public void sacar(double valor){
        this.saldo-=valor;
    }

    public void exibirSaldo(){
        System.out.println("Titular: "+titular);
        System.out.println("Da conta: "+numeroConta);
        System.out.println("Seu saldo é: "+saldo);
    }
}
