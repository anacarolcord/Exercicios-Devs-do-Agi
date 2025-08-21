package br.com.devsdoagi.ClassesAbstratas.Exercicio03;

public class RendaVariavel extends Investimento{

    public RendaVariavel(double valorAplicado){
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        double resultado = this.valorAplicado*0.10;
        resultado+=this.valorAplicado;

        return resultado;
    }
}
