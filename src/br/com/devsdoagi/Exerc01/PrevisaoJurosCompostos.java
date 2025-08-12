package br.com.devsdoagi.Exerc01;
import java.util.Scanner;

public class PrevisaoJurosCompostos {
    public static void main(String[] args) {
        double capitalInicial=1000;
        int meses = 6;
        double taxa = 0.02;

        calcularJurosCompostos(capitalInicial,taxa,meses);
    }

    public static double[] calcularJurosCompostos(double valorInicial, double taxa, int meses){
        int i;
        double valorAtualizado=0;
        double [] valoresFuturos = new double[meses];
        //double montante = valorInicial*taxa*meses;
        for(i=0;i<meses;i++){
            valorAtualizado = valorInicial*(Math.pow(1+(taxa),meses));
            valorInicial = valorAtualizado;

            valoresFuturos[i]=valorAtualizado;

            System.out.println("Valor do investimento no mês "+(i+1)+" - "+(valoresFuturos[i]));
        }

        return valoresFuturos;
    }
}
