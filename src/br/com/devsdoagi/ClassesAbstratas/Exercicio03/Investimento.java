package br.com.devsdoagi.ClassesAbstratas.Exercicio03;

abstract class Investimento {
    public double valorAplicado;

    public Investimento(double valorAplicado){
        this.valorAplicado=valorAplicado;
    }

    public abstract double calcularRendimento();
}
