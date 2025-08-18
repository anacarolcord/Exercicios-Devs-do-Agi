package br.com.devsdoagi.Encapsulamento.Exercicio01;
import java.util.Scanner;
public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

<<<<<<< HEAD
        conta.setTitular("Ana Carolina Cordeiro");
        conta.setNumeroConta("00896-4");

=======
>>>>>>> 0afc31a472297caad7c95c971b941b5897fdc2f6
        System.out.println("Digite o valor do deposito: R$");
        double deposito = in.nextDouble();

        conta.depositar(deposito);

<<<<<<< HEAD

=======
>>>>>>> 0afc31a472297caad7c95c971b941b5897fdc2f6
        System.out.println("Digite o valor do saque: R$");
        double saque = in.nextDouble();

        conta.sacar(saque);

        conta.exibirExtrato();

<<<<<<< HEAD


        

=======
        conta.setTitular("Bruna Caetano");

        conta.exibirExtrato();
        
        //chamar os metodos get e set para mostrar os dados de nome e conta
        //porque se rodar assim sem chamar vai dar null
>>>>>>> 0afc31a472297caad7c95c971b941b5897fdc2f6

    }
}
