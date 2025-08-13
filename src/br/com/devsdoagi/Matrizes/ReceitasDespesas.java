package br.com.devsdoagi.Matrizes;
import java.util.Scanner;

public class ReceitasDespesas {
    public static void preencherMatriz(double [][] recdesp){
        Scanner in = new Scanner(System.in);

        int i,j;
        for(i=0;i< recdesp.length;i++) {
            for(j=0;j< recdesp[i].length;i++) {
                System.out.println("Digite o valor "+(i+1)+" :");
                recdesp[i][j]= in.nextDouble();
            }
        }
    }

    public static double calcularSomaTotal(double[][] recdesp){
        int i,j;
        double soma =0;
        for(i=0;i<recdesp.length;i++){
            for(j=0;j<recdesp[i].length;j++){
                soma+=recdesp[i][j];
            }
        }

        System.out.println(soma);

        return soma;
    }

    public static void main(String[] args) {
        double[][] recdesp = new double [2][2];
        double soma;

        preencherMatriz(recdesp);
        soma = calcularSomaTotal(recdesp);

        System.out.println(soma);
    }
}
