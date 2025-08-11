package br.com.devsdoagi.ListaExercicioMetodos;
import java.util.Scanner;

public class CalcularCrescimento {
    public static double calcularCrescimento(double precoDia1, double precoDia2){

        double diferenca = precoDia2-precoDia1;
        double porcentagem = (diferenca*precoDia1)/100;

        System.out.println("Crescimento: "+ porcentagem +"%");
        return porcentagem ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o preco da acao do dia 1: ");
        double dia1 = in.nextDouble();
        System.out.println("Digite o preco da acao do dia 2: ");
        double dia2 = in.nextDouble();

        calcularCrescimento(dia1,dia2);
    }
}
