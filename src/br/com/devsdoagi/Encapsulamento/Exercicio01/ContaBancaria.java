package br.com.devsdoagi.Encapsulamento.Exercicio01;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 0afc31a472297caad7c95c971b941b5897fdc2f6

public class ContaBancaria {
    private String titular;
    private String numeroConta;
<<<<<<< HEAD
    private double saldo;
=======
    private double saldo=5000;
>>>>>>> 0afc31a472297caad7c95c971b941b5897fdc2f6

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
<<<<<<< HEAD
        this.titular = titular;
=======
        this.titular = "Ana Carolina Cordeiro";
>>>>>>> 0afc31a472297caad7c95c971b941b5897fdc2f6
    }

    public String getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(String conta){
<<<<<<< HEAD
        this.numeroConta = conta;
    }



=======
        this.numeroConta = "00897-0";
    }
    public double getSaldo(){
        return saldo;
    }
>>>>>>> 0afc31a472297caad7c95c971b941b5897fdc2f6


    public double depositar(double valor){

<<<<<<< HEAD
        if(valor>0) {
            this.saldo += valor ;
        }else{
            System.out.println("Deposite um valor válido!");
        }

        return this.saldo;

    }

    public double sacar(double valor){

        if (valor>this.saldo){
            System.out.println("Saldo insuficiente!");
        }else {
           this.saldo-=valor;
        }

        return this.saldo;
=======
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
>>>>>>> 0afc31a472297caad7c95c971b941b5897fdc2f6
    }

    public void exibirExtrato(){
        System.out.println("======================================");
<<<<<<< HEAD
        System.out.println("EXTRATO BANCÁRIO CLIENTE "+getTitular());
        System.out.println("CONTA BANCARIA: "+getNumeroConta());
        System.out.println("SALDO: R$"+this.saldo);
        System.out.println("\n======================================");

    }


=======
        System.out.println("EXTRATO BANCÁRIO CLIENTE "+this.titular);
        System.out.println("CONTA BANCARIA: "+this.numeroConta);
        System.out.println("SALDO: R$"+this.saldo);
        System.out.println("\n======================================");
        System.out.println("HISTORICO DE MOVIMENTACAO BANCARIA");
        System.out.println("DEPOSITOS: R$"+this.depositar(this.saldo));
        System.out.println("SAQUES: R$"+this.sacar(this.saldo));

    }
>>>>>>> 0afc31a472297caad7c95c971b941b5897fdc2f6
}
