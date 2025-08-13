package br.com.devsdoagi.Exerc01;
import java.util.Scanner;

public class PercentualAcumulado{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] valorAcao = {100,102,101,110,120};

        System.out.println(calcularCrescimentoAcumulado(valorAcao));

    }

    public static double calcularCrescimentoAcumulado(double[] valorAcao){
        double soma=0;
        for(int i=0; i<valorAcao.length;i++){
            soma+=valorAcao[i];
        }

        double resultado = (soma/valorAcao.length)/100;

        return resultado ;
    }
}
