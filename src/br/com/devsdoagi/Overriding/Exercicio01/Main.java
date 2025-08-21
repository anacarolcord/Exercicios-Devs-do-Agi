package br.com.devsdoagi.Overriding.Exercicio01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //a partir do objeto pagamentos do tipo Pagamento
        //podemos criar objetos das classes filhas!!!
        // cada indice do vetor recebe um "tipo do tipo"

        Pagamento[] pagamentos = {
                new Pagamento(100),
                new PagamentoCartaoCredito(200,"12345-6789"),
                new PagamentoPix(350,"u129739827whdi80823")};

        PagamentoCartaoCredito[] p2 = new PagamentoCartaoCredito[2];
        PagamentoPix[] p3 = new PagamentoPix[2];

        //posso usar como entrada de dados<<<<<<<<<<<<<

        /*for (int i = 0; i < pagamentos.length; i++) {
            System.out.println("Digite o valor do pagamento "+(i+1)+" R$");
            pagamentos[i].valor=in.nextDouble();

        }*/

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento();
        }




    }
}
