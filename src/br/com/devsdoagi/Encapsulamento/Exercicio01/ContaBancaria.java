package br.com.devsdoagi.Encapsulamento.Exercicio01;
import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo=5000;

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = "Ana Carolina Cordeiro";
    }

    public String getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(String conta){
        this.numeroConta = "00897-0";
    }
    public double getSaldo(){
        return saldo;
    }


    public double depositar(double valor){

        double resultado=0;
        if(valor>0) {
            resultado = saldo += valor ;
        }else{
            System.out.println("Deposite um valor válido!");
        }
        return resultado;
    }

    public double sacar(double valor){
        double resultado=0;
        if (valor>this.saldo){
            System.out.println("Saldo insuficiente!");
        }else {
            resultado = this.saldo-=valor;
        }

        return resultado;
    }

    public void exibirExtrato(){
        System.out.println("======================================");
        System.out.println("EXTRATO BANCÁRIO CLIENTE "+this.titular);
        System.out.println("CONTA BANCARIA: "+this.numeroConta);
        System.out.println("SALDO: R$"+this.saldo);
        System.out.println("\n======================================");
        System.out.println("HISTORICO DE MOVIMENTACAO BANCARIA");
        System.out.println("DEPOSITOS: R$"+this.depositar(this.saldo));
        System.out.println("SAQUES: R$"+this.sacar(this.saldo));

    }
}
