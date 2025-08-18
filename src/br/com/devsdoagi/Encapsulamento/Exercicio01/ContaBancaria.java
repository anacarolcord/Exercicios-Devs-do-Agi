package br.com.devsdoagi.Encapsulamento.Exercicio01;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroConta(String conta){
        this.numeroConta = conta;
    }





    public double depositar(double valor){

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
    }

    public void exibirExtrato(){
        System.out.println("======================================");
        System.out.println("EXTRATO BANCÁRIO CLIENTE "+getTitular());
        System.out.println("CONTA BANCARIA: "+getNumeroConta());
        System.out.println("SALDO: R$"+this.saldo);
        System.out.println("\n======================================");

    }


}
