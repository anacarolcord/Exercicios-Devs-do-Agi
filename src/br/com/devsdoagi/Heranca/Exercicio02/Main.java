package br.com.devsdoagi.Heranca.Exercicio02;

public class Main {
    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel(" ");

        pp.dataValidade="31/09/25";

        pp.estaVencido("19/08/25");
        System.out.println(pp.estaVencido("31/09/25"));
    }
}
