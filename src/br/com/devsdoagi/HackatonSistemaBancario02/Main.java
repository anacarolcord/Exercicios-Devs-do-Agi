package br.com.devsdoagi.HackatonSistemaBancario02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Investimento[] investimentos = new Investimento[2];

        RendaFixa rf = new RendaFixa(400);
        RendaVariavel rv = new RendaVariavel(400);

        System.out.println("===== SISTEMA DE INVESTIMENTO =====\n");

        investimentos[0]=rf;
        investimentos[1]=rv;



        for (int i = 0; i < investimentos.length; i++) {
            if (investimentos[i] == rf) {
                System.out.println("O valor final do investimento de R$"+rf.getValorInicial()+" na renda fixa será de R$" + investimentos[i].calcularRendimento());
            } else {
                System.out.println("O valor final do investimento de R$"+rv.getValorInicial()+" na renda variável será R$" + investimentos[i].calcularRendimento());
            }
        }
    }
}

//NOTAS
//15
//15
//10
//15
//15
//20
//10
//NOTA TOTAL: 100
