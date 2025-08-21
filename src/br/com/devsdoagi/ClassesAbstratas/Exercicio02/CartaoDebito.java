package br.com.devsdoagi.ClassesAbstratas.Exercicio02;

public class CartaoDebito extends Cartao{
    public double saldoConta;

    public CartaoDebito(String numero,double saldoConta){
        super(numero,0);
        this.saldoConta=saldoConta;
    }

    public void processarCompra(double valor){
        double resultado = this.saldoConta-valor;
        System.out.println("Compra de "+valor+" realizada no cartão de débito "+numero+"\no saldo atual é: R$"+resultado);
    }
}
