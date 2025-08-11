package br.com.devsdoagi.ListaExercicioMetodos;
import java.util.Scanner;

public class ConverterMoeda {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x,y;
        System.out.println("Digite o valor em reais: R$");
        x = in.nextDouble();
        System.out.println("\nDigite a taxa de conversão para dolares: ");
        y = in.nextDouble();

        converterMoeda(x,y);

    }

    public static double converterMoeda(double a, double b){
        double resultado = a/b;
        System.out.printf("O valor em reais R$ %.2f convertido para dolares é US$%.2f",a,resultado);
        return resultado;
    }
}
