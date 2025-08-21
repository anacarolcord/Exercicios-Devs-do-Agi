package br.com.devsdoagi.Interface.Exercicio02;

public class Main {
    public static void main(String[] args) {

        IDescontavel desconto1 = new ProdutoComum();
        IDescontavel desconto2 = new ProdutoPromocional();

        System.out.println(desconto1.calcularPrecoFinal(200));
        System.out.println(desconto2.calcularPrecoFinal(200));
    }



}
