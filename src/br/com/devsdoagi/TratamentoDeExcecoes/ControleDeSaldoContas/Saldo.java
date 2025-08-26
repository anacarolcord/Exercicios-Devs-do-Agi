package br.com.devsdoagi.TratamentoDeExcecoes.ControleDeSaldoContas;
import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] saldo = {100,200,300,400,500,600,700,800,900,1000};

        try {
                System.out.println("Escolha o índice referente conta que deseja obter o valor: ");
                int indice = in.nextInt();

                System.out.println("O valor da conta selecionada é: "+ saldo[indice]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("Erro! Conta não encontrada!");
        }




    }
}
