package br.com.devsdoagi.ClassesAbstratas.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Cartao credito = new CartaoCredito("23476.9982.27931",2500);
        Cartao debito = new CartaoDebito("6362.74987.3982",2500);

        credito.processarCompra(2400);
        debito.processarCompra(140);

    }
}
