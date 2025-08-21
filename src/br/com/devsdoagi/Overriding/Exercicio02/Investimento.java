package br.com.devsdoagi.Overriding.Exercicio02;

public class Investimento {

    public double valorAplicado;

    public Investimento(double valorAplicado){
        this.valorAplicado=valorAplicado;
    }

    public Investimento(){}

    public double getValorAplicado(){
        return this.valorAplicado;
    }

    public void setValorAplicado(double valorAplicado){
        this.valorAplicado=valorAplicado;
    }

    public double calcularRendimento(){
        double resultado = this.valorAplicado*0;
        resultado+=valorAplicado;


        return 0;
    }
}
