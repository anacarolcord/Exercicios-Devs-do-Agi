package br.com.devsdoagi.Exerc01;
import java.util.Scanner;

public class CarteiraAcoes {

    public static double [] percentualPorAcao(double[]carteira){
         double soma=0;
         double []percentual = new double[carteira.length];
         int i;
         for(i=0;i< carteira.length;i++){
             soma+=carteira[i];
         }

         for (i=0;i<carteira.length;i++){
             percentual[i]=((soma/carteira[i])/100);
             System.out.println("O percentual da ação "+(i+1)+" é: "+(percentual[i]));
         }


         return percentual;
    }

    public static double totalInvestido(double[]carteira){
        double soma =0;
        for(int i=0;i<carteira.length;i++){
            soma+=(carteira[i]);
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double [] valorAcoes = {100,102,104,112,899};

        percentualPorAcao(valorAcoes);
    }
}
