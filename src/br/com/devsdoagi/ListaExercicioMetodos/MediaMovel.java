package br.com.devsdoagi.ListaExercicioMetodos;
import java.util.Scanner;

public class MediaMovel {
    public static double calcularMediaMovel(double[] precos, int intervalo){
        int i;

        double soma =0;

        for(i=0; i<=precos.length; i++){

            soma += precos[i];
        }

        double media = soma/precos.length;

        System.out.println(media);

        return media;
    }

    public static void main(String[] args) {

        double[] precos = {100,101,102,103,104};
        int intervalo = 3;

        calcularMediaMovel(precos,intervalo);

    }
}
