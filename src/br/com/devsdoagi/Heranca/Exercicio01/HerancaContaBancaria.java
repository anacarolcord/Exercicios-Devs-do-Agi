package br.com.devsdoagi.Heranca.Exercicio01;

public class HerancaContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public HerancaContaBancaria(){
        this.titular=" ";
        this.numeroConta=" ";
        this.saldo=0.0;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setTitular(String titular){
        this.titular=titular;
    }

    public String getnumeroConta(){
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta=numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

}
