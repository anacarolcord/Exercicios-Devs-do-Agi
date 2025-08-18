package br.com.devsdoagi.Encapsulamento.Exercicio01;
import java.util.Scanner;
public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        conta.setTitular("Ana Carolina Cordeiro");
        conta.setNumeroConta("00896-4");

        System.out.println("Digite o valor do deposito: R$");
        double deposito = in.nextDouble();

        conta.depositar(deposito);


        System.out.println("Digite o valor do saque: R$");
        double saque = in.nextDouble();

        conta.sacar(saque);

        conta.exibirExtrato();



        


    }
}
