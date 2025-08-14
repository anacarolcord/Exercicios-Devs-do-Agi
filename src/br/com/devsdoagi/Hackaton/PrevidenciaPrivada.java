package br.com.devsdoagi.Hackaton;
import java.util.Scanner;

public class PrevidenciaPrivada {

    public static double[] calcularSaldoAnual(
            int idadeAtual,
            int idadeAposentadoria,
            double contribuicaoMensal,
            double taxaAnual
    ) {
        int anos = idadeAposentadoria - idadeAtual;
        double[] saldoAnual = new double[anos];


        double taxaMensal = taxaAnual / 100.0 / 12.0;

        for (int i = 1; i <= anos; i++) {
            int meses = i * 12;


            double saldo = contribuicaoMensal * (Math.pow(1 + taxaMensal, meses) - 1) / taxaMensal;

            saldoAnual[i - 1] = saldo;
        }

        return saldoAnual;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite sua idade atual: ");
        int idadeAtual = in.nextInt();
        System.out.println("Digite a idade da aposentadoria: ");
        int idadeAposentadoria = in.nextInt();
        System.out.println("Contribuicao mensal: ");
        double contribuicaoMensal= in.nextDouble();

        double[] resultado = calcularSaldoAnual(idadeAtual,idadeAposentadoria,contribuicaoMensal,0.03);

        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("Ano %d: R$ %.2f%n", i + 1, resultado[i]);
        }
    }
}

