package br.com.devsdoagi.ListaExercicioMetodos;
import java.util.Scanner;

public class SimularPreco {
    public static void main(String[] args) {

    }

    public static double simularPrecoMonteCarlo(double precoInicial, double retornoMedio, double volatidade, int periodo){
        double variacaoAleatoria = volatidade * precoInicial;
        double novoPreco = precoInicial * (1+retornoMedio + variacaoAleatoria);
        return 0;
    }
}
