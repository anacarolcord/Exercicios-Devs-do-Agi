package br.com.devsdoagi.TratamentoDeExcecoes.CalculoMediaMovel;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MediaMovel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] acoes;
        System.out.println("Digite a quantidade de dias: ");
        int dias = in.nextInt();

        if (dias < 3) {
            System.out.println("Quantidade insuficiente!");
        } else {
            acoes = new double[dias];

            int i;


            try {

                for (i = 0; i < acoes.length; i++) {
                    System.out.println("Digite o valor do dia " + (i + 1) + ": R$");
                    acoes[i] = in.nextDouble();
                }

                for (i = 2; i < acoes.length; i++) {

                    double mediaMovel = (acoes[i] + acoes[i - 1] + acoes[i - 2]) / 3;
                    System.out.println("Media Móvel dia " + (i + 1) + " " + mediaMovel);

                }

            } catch (NumberFormatException e) {
                System.out.println("Numero invalido!");
            } catch (IllegalArgumentException a) {
                System.out.println("Você não informou valores suficientes para obter a média!");
            }
        }
    }

}
