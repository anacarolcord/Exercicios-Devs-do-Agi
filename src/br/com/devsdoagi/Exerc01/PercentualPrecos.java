package br.com.devsdoagi.Exerc01;
import java.util.Scanner;

public class PercentualPrecos {

    public static double []variacaoDiaria(double[] precos){
        double[] diferenca = new double[precos.length-1];
        for(int i =0;i<precos.length-1;i++){
            diferenca [i]=((precos[i+1]-precos[i])/precos[i])*100;
            System.out.println("A variação percentual do dia "+(i+1)+" é "+(diferenca[i]));
        }
      return diferenca;
    }




    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        double [] precosDiarios = new double[5];

        for(int i =0; i< precosDiarios.length;i++) {
            System.out.println("Digite o preço do dia "+(i+1));
            precosDiarios[i]=in.nextDouble();
        }

        variacaoDiaria(precosDiarios);
    }
}
