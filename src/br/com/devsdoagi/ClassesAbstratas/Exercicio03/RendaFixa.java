package br.com.devsdoagi.ClassesAbstratas.Exercicio03;

public class RendaFixa extends Investimento{

    public RendaFixa(double valorAplicado){
        super(valorAplicado);
    }

    public double calcularRendimento(){
        double resultado=this.valorAplicado*0.05;
        resultado+=this.valorAplicado;

        return resultado;
    }
}
