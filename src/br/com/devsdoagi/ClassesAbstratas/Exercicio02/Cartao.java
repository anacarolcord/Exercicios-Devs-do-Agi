package br.com.devsdoagi.ClassesAbstratas.Exercicio02;

abstract class Cartao {
    public String numero;
    public double limite;

    public Cartao(String numero, double limite){
        this.numero=numero;
        this.limite=limite;
    }

    public abstract void processarCompra(double valor);

}
