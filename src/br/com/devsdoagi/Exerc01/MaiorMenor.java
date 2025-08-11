package br.com.devsdoagi.Exerc01;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        double [] precoAcao = new double[10];

        for(i=0; i< precoAcao.length;i++) {
            System.out.println("Digite o preço da ação do " + (i + 1) + "º dia");
            precoAcao[i]= in.nextDouble();
        }

        maiorPreco(precoAcao);
        menorPreco(precoAcao);

    }

    public static double maiorPreco(double [] precos){
        int i;
        double maior=0;
        for(i=0;i<precos.length;i++){
            if(precos[i]>maior){
                maior=precos[i];

            }
        }
        System.out.println("O maior preço durante os 10 dias foi: R$"+maior);
        return maior;
    }

    public static double menorPreco(double [] precos){
        double menor=precos[0];
        int i;

        for(i=0;i<precos.length;i++){
            if(precos[i]<menor){
                menor=precos[i];
            }
        }

        System.out.println("O menor preço durante os 10 dias foi: R$"+menor);

        return menor;
    }
}
