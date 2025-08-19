package br.com.devsdoagi.Heranca.Exercicio01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HerancaContaBancaria cbpai = new HerancaContaBancaria();
        ContaCorrente cc = new ContaCorrente();
        Scanner in = new Scanner(System.in);

        cc.setTitular("Ana Carolina ");
        cc.setSaldo(2000);
        cc.setNumeroConta("33456-x");

        System.out.println("Quanto deseja sacar? ");
        double valorSaque = in.nextDouble();

        cc.sacarComChequeEspecial(valorSaque);

        System.out.println(cc.getLimiteChequeEspecial());
        System.out.println(cc.getTitular());

        cc.setTitular("Sarah");

        System.out.println(cc.getTitular());


    }
}
