package br.com.devsdoagi.ClassesAbstratas.Exercicio02;

public class CartaoCredito extends Cartao{

    public CartaoCredito(String numero, double limite){
        super(numero,limite);
    }

    public void processarCompra(double valor){
        double resultado = this.limite-valor;
        System.out.println("Compra de R$"+valor+" realizada no cartão de crédito "+numero+"\nlimite atual: R$"+resultado);
    }

}
