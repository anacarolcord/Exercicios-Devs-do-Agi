package br.com.devsdoagi.Encapsulamento.Exercicio01;
import java.util.Scanner;
public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o valor do deposito: R$");
        double deposito = in.nextDouble();

        conta.depositar(deposito);

        System.out.println("Digite o valor do saque: R$");
        double saque = in.nextDouble();

        conta.sacar(saque);

        conta.exibirExtrato();

        conta.setTitular("Bruna Caetano");

        conta.exibirExtrato();
        
        //chamar os metodos get e set para mostrar os dados de nome e conta
        //porque se rodar assim sem chamar vai dar null

    }
}
