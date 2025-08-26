package br.com.devsdoagi.HackatonSistemaBancario02;

public abstract class Investimento {
    public double valorInicial;

    public Investimento(double valorInicial){
        this.valorInicial=valorInicial;
    }

    public abstract double calcularRendimento();
}
