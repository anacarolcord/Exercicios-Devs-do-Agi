package br.com.devsdoagi.ClassesAbstratas.Exercicio03;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Investimento rendaFixa = new RendaFixa(2000);
        Investimento rendaVariavel = new RendaVariavel(2000);

        System.out.println(rendaFixa.calcularRendimento());
        System.out.println(rendaVariavel.calcularRendimento());
    }
}
