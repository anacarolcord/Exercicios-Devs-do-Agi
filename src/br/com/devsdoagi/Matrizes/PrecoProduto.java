package br.com.devsdoagi.Matrizes;
import java.util.Scanner;

public class PrecoProduto {

    public static double[] encontrarMenorPrecoProduto(double[][] precoProduto){
        double []menorPreco = new double[precoProduto[0].length];
        double menor;

        for(int p=0; p< precoProduto[0].length;p++){
            menor=precoProduto[0][p];
            for(int l=0; l< precoProduto.length;l++){
                if(precoProduto[l][p]<menor){
                    menor=precoProduto[l][p];
                }

            }
            menorPreco[p]= menor;
            System.out.println(menorPreco[p]);
        }
        return menorPreco;
    }


    public static void main(String[] args) {
        double [][] precoProduto = { {100,1},
                                     {12,23},
                                     {45,4}}  ;

        encontrarMenorPrecoProduto(precoProduto);
    }
}
