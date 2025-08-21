package br.com.devsdoagi.Overriding.Exercicio02;

public class Poupanca extends Investimento{

    public Poupanca(double valorAplicado){
        super(valorAplicado);
    }


    @Override

    public double calcularRendimento(){
       double resultado = this.valorAplicado*0.005;
       resultado+=this.valorAplicado;

       return resultado;
    }
}
