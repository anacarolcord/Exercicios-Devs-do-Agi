package br.com.devsdoagi.Matrizes;
import java.util.Scanner;


public class AnaliseSaldoContaCorrente {

    public static double saldoFinal(double [][] saldos, int cliente) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o cliente que deseja ver o saldo final: ");
        cliente = in.nextInt();
        cliente = cliente-1;
        double [] vetor = new double [cliente];
        int i;
        double saldoFinalf = 0;
        for (i = 0; i < saldos[cliente][saldos.length]; i++) {

        }

        return 0;
    }







    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a qtd de clientes: ");
        int N = in.nextInt();
        System.out.println("Digite a qtd de dias: ");
        int M = in.nextInt();

        double [][] saldos = new double [N][M];

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
            System.out.println("Digite o valor do " + (j + 1) + "º dia para o cliente " + (i + 1));
            saldos[i][j]= in.nextDouble();

        }


    }}}

