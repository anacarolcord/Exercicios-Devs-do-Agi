package br.com.devsdoagi.HackatonSistemaBancario02;

public class RendaVariavel extends Investimento{
    public RendaVariavel(double valorInicial){
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial*1.10;
    }

    public double getValorInicial(){
        return this.valorInicial;
    }

    public void setValorInicial(double valor){
        this.valorInicial=valor;
    }
}
