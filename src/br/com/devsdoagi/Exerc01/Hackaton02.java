package br.com.devsdoagi.Exerc01;
import java.util.Scanner;

public class Hackaton02 {

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

    public static double[][] gerarMatrizCenarios(int idadeAtual, int idadeAposentadoria, double contribuicaoMensal, double[] taxasAnuais) {
        int anos = idadeAposentadoria - idadeAtual;
        double[][] matriz = new double[taxasAnuais.length][anos + 1];

        for (int i = 0; i < taxasAnuais.length; i++) {
            double taxa = taxasAnuais[i];
            double saldo = 0.0;
            matriz[i][0] = saldo;

            for (int ano = 1; ano <= anos; ano++) {
                saldo += contribuicaoMensal * 12;
                saldo *= (1 + taxa);
                matriz[i][ano] = saldo;
            }
        }

        return matriz;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int escolhauser;
        int escolhauser2;
        String nome;
        int idade;
        int idadeaposentadoria;
        double contrimensal;
        double[] taxaanuais = new double[0];
        double resultadosaldo;
        double resultadomatriz;
        double resultadocalculo;
        ;

        String Vermelho = "\u001B[31m";
        String Azul = "\u001B[34m";
        String Verde = "\u001B[32m";
        String Resetcor = "\u001B[0m";
        double[] numeros = new double[]{100,110,120};

        do {
            System.out.println(Azul + " Bem vindo ao Menu da previdencia \n" + Resetcor);
            System.out.println(Azul + "Entre com seus dados no sistema \n");
            System.out.println("Inserção de dados");
            System.out.println("Digite a idade");
            idade = in.nextInt();
            System.out.println("Idade aposentadoria");
            idadeaposentadoria = in.nextInt();
            System.out.println("Contribuição mensal");
            contrimensal = in.nextInt();
            System.out.println("Informe a taxa anual: ");
            double taxaanual = in.nextDouble();

            System.out.println(Azul + " 1 - " + Resetcor + "Calculo de saldo anual \n");
            System.out.println(Azul + " 2 - " + Resetcor + "Gerar a Matriz de cenários \n");
            System.out.println(Azul + " 3 - " + Resetcor + "Calculo de renda mensal na aposentadoria \n");
            System.out.println(Azul + " 4 -" + Resetcor + "Exibição de  resultados \n");
            System.out.println(Azul + " 5 - " + Resetcor + "Sair do sistema \n");
            System.out.println(Azul + "Por favor, escolha a sua opção abaixo \n " + Verde + "Opção : " + Resetcor);
            escolhauser = in.nextInt();

            if (escolhauser == 1) {

                double[] metodo1 = calcularSaldoAnual(idade, idadeaposentadoria, contrimensal, taxaanual);


            } else if (escolhauser == 2) {
                double[] taxas = new double[3];
                for (int i = 0; i <= 3; i++) {
                    System.out.println("Digite a taxa " + (i + 1));
                    taxas[i] = in.nextDouble();
                }

                gerarMatrizCenarios(idade, idadeaposentadoria, contrimensal, taxas);

            } else if (escolhauser == 3) {


                // Corpo da tabela
                int anos = idadeaposentadoria - idade;
                for (int ano = 0; ano <= anos; ano++) {
                    System.out.printf("%-6d", idade + ano);
                    for (int i = 0; i < 1; i++) {
                        System.out.printf("%15s", String.format("R$ %, .2f", matriz[i][ano]));
                    }
                    System.out.println();
                }
            }
            else if (escolhauser == 3){
                System.out.println("Matriz de cenários");
                System.out.printf("%-6s", "Ano");
                for (double taxa : taxaanuais) {
                    System.out.printf("%15s", String.format("Cenário %.0f%%", taxa * 100));
                }
                System.out.println();

                /*Corpo da tabela
                int anos = idadeaposentadoria- idade;
                for (int ano = 0; ano <= anos; ano++) {
                    System.out.printf("%-6d", idade + ano);
                    for (int i = 0; i < taxaanuais.length; i++) {
                        System.out.printf("%15s", String.format("R$ %, .2f", matriz[i][ano]));
                    }
                    System.out.println();

                }
            } else if (escolhauser == 4){
                System.out.println("Renda mensal");


            } else if (escolhauser == 5){
                System.out.println("Exibição de resultados");

            } else if (escolhauser == 6){
                System.out.println("Saindo do sistema");
                System.out.println(". . .");
                return;

            } else{
                System.out.println("invalido");
            }
            System.out.println("deseja continuar ? " + Azul + "1 - Sim " + Vermelho + " 2 - Não, fechar programa " + Resetcor + "\n Escolha");
            escolhauser2 = in.nextInt();


        } /*while(escolhauser2 == 1);
        if (escolhauser2 == 2){
            System.out.println(Azul +"Muito obrigado por usar nosso sistema ! ");
            System.out.println(". \n.\n. ");
            in.close();
            return;
        }
    }
}
}
