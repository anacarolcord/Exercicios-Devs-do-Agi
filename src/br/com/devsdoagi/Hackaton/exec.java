package br.com.devsdoagi.Hackaton;

import java.util.Arrays;
import java.util.Scanner;

// Feito com amor, e cuidado Pelos integrantes Gabriel Paraiso, Nayani Carvalho, Henrique Mourão, Matheus Oliveira, Ana carolina Cordeiro

    public class exec {

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
            int idade = 0;
            int idadeaposentadoria = 0;
            double contrimensal = 0;
            double[] taxaanuais = new double[3];
            double[][] matriz = null;

            String Vermelho = "\u001B[31m";
            String Azul = "\u001B[34m";
            String Verde = "\u001B[32m";
            String Resetcor = "\u001B[0m";


            System.out.println("Inserção de dados");
            System.out.print("Digite a idade: ");
            idade = in.nextInt();

            System.out.print("Idade para aposentadoria: ");
            idadeaposentadoria = in.nextInt();
            System.out.print("Contribuição mensal: ");
            contrimensal = in.nextDouble();
            for (int i = 0; i < 3; i++) {
                System.out.print("Digite a taxa anual " + (i + 1) + " (ex: 0.03 para 3%): ");
                taxaanuais[i] = in.nextDouble();
            }
            matriz = gerarMatrizCenarios(idade, idadeaposentadoria, contrimensal, taxaanuais);
            do {
                System.out.println(Azul + "\n--- Menu da Previdência ---\n" + Resetcor);
                System.out.println(Azul + "1 - " + Resetcor + " Atualização de dados");
                System.out.println(Azul + "2 - " + Resetcor + "Cálculo de saldo anual");
                System.out.println(Azul + "3 - " + Resetcor + "Gerar a Matriz de cenários");
                System.out.println(Azul + "4 - " + Resetcor + "Cálculo de renda mensal na aposentadoria");
                System.out.println(Azul + "5 - " + Resetcor + "Exibição de resultados");
                System.out.println(Azul + "6 - " + Resetcor + "Sair do sistema");
                System.out.print(Verde + "Opção: " + Resetcor);
                escolhauser = in.nextInt();

                if (escolhauser == 1) {

                    System.out.print("Digite a idade: ");
                    idade = in.nextInt();

                    System.out.print("Idade para aposentadoria: ");
                    idadeaposentadoria = in.nextInt();

                    System.out.print("Contribuição mensal: ");
                    contrimensal = in.nextDouble();

                    for (int i = 0; i < 3; i++) {
                        System.out.print("Digite a taxa anual " + (i + 1) + ": ");
                        taxaanuais[i] = in.nextDouble();
                    }


                    matriz = gerarMatrizCenarios(idade, idadeaposentadoria, contrimensal, taxaanuais);

                } else if (escolhauser == 2) {
                    System.out.println("\nCálculo de saldo anual");
                    System.out.printf("%-6s", "Ano");
                    System.out.println(" Cenário 3%");
                    int anos = idadeaposentadoria - idade;
                    for (int ano = 0; ano <= anos; ano++) {
                        System.out.printf("%-6d", idade + ano);
                        System.out.printf("%15s", String.format("R$ %,.2f", matriz[0][ano]));
                        System.out.println();
                    }

                } else if (escolhauser == 3) {
                    System.out.println("\nMatriz de cenários");
                    System.out.printf("%-6s", "Ano");
                    for (double taxa : taxaanuais) {
                        System.out.printf("%15s", String.format("Cenário %.0f%%", taxa * 100));
                    }
                    System.out.println();

                    int anos = idadeaposentadoria - idade;
                    for (int ano = 0; ano <= anos; ano++) {
                        System.out.printf("%-6d", idade + ano);
                        for (int i = 0; i < taxaanuais.length; i++) {
                            System.out.printf("%15s", String.format("R$ %,.2f", matriz[i][ano]));
                        }
                        System.out.println();
                    }

                } else if (escolhauser == 4) {
                    System.out.println("\nCálculo de renda mensal na aposentadoria");

                    System.out.print("Quantos anos você espera receber a aposentadoria? ");
                    int anosAposentado = in.nextInt();

                    System.out.println("\nRenda mensal estimada para cada cenário:");
                    for (int i = 0; i < taxaanuais.length; i++) {
                        double saldoFinal = matriz[i][idadeaposentadoria - idade];
                        double rendaMensal = saldoFinal / (anosAposentado * 12);
                        System.out.printf("Cenário %.0f%%: R$ %,.2f por mês\n", taxaanuais[i] * 100, rendaMensal);
                    }

                } else if (escolhauser == 5) {
                    System.out.println("\nExibição de resultados finais");
                    System.out.println("Idade inicial: " + idade);
                    System.out.println("Idade aposentadoria: " + idadeaposentadoria);
                    System.out.printf("Contribuição mensal: R$ %,.2f\n", contrimensal);
                    System.out.println("Taxas anuais: " + Arrays.toString(taxaanuais));

                    System.out.println("\nSaldo final em cada cenário:");
                    for (int i = 0; i < taxaanuais.length; i++) {
                        double saldoFinal = matriz[i][idadeaposentadoria - idade];
                        System.out.printf("Cenário %.0f%%: R$ %,.2f\n", taxaanuais[i] * 100, saldoFinal);
                    }

                } else if (escolhauser == 6) {
                    System.out.println("Saindo do sistema...");
                    break;

                } else {
                    System.out.println("Opção inválida!");
                }

                System.out.print("\nDeseja continuar? " + Azul + "1 - Sim " + Vermelho + "2 - Não" + Resetcor + " → ");
                escolhauser2 = in.nextInt();

            } while (escolhauser2 == 1);

            in.close();
        }
    }

