package br.com.devsdoagi.POO.Exercicio02;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(3400);

        conta.exibirSaldo();

        conta.sacar(458);

        conta.exibirSaldo();

    }
}
