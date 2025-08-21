package br.com.devsdoagi.Overriding.Exercicio02;

public class CDB extends Investimento{
    public CDB (double valorAplicado){
        super(valorAplicado);
    }

    @Override

    public double calcularRendimento(){
        double resultado = getValorAplicado()*0.01;
        resultado+=getValorAplicado();

        return resultado;
    }
}
