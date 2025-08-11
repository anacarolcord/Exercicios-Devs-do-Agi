package br.com.devsdoagi.ListaExercicioMetodos;
import java.util.Scanner;

public class CalcularJurosSimples {
    public static double calcularJurosSimples(double capitalInicial, double taxaAnual, double tempoAnos){

        double juros = capitalInicial*(taxaAnual/100)*tempoAnos;
        double montanteFinal = capitalInicial+juros;

        System.out.println(montanteFinal);
        return montanteFinal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor inicial: R$ ");
        double valorInicial = in.nextDouble();
        System.out.print("Digite a taxa: ");
        double taxa = in.nextDouble();
        System.out.println("Digite o tempo em anos: ");
        double tempo = in.nextDouble();
        System.out.println("\n************************\n");
        System.out.println("O resultado final do seu investimento é: ");

        calcularJurosSimples(valorInicial,taxa,tempo);

    }
}
