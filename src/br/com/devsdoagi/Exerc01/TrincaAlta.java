package br.com.devsdoagi.Exerc01;
import java.util.Scanner;

public class TrincaAlta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double [] precoDiario = new double [10];
        int i;
        for(i=0;i<precoDiario.length;i++) {
            System.out.println("Digite o valor do preço do dia " + (i + 1));
            precoDiario[i] = in.nextDouble();
        }

        int [] resultado = primeiraTrincaAlta(precoDiario);

        if (resultado!=null) {
            for (i = 0; i <precoDiario.length;i++) {
                System.out.println(primeiraTrincaAlta(precoDiario));
            }
        }

    }

    //A função vai identificar a primeira sequência de 3 dias
    // consecutivos de alta

    public static int[] primeiraTrincaAlta(double []precos){

        int i;

        for(i=0;i<precos.length-2;i++) {
            if (precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]) {

                return new int[] {i, i+1,i+2};

            }


        }

        return null;






    }
}
