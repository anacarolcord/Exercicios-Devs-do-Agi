package br.com.devsdoagi.HackatonSistemaBancario02;

public class RendaFixa extends Investimento{
    public RendaFixa(double valorInicial){
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial*1.05;
    }

    public double getValorInicial(){
        return valorInicial;
    }

    public void setValorInicial(double valor){
        this.valorInicial=valor;
    }
}
