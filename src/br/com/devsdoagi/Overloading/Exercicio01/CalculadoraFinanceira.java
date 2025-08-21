package br.com.devsdoagi.Overloading.Exercicio01;

public class CalculadoraFinanceira {


    public CalculadoraFinanceira(){}



    public double calcularJuros(double capital,double taxa, int meses){
        return capital*(taxa/100)*meses;
    }

    //Overloading
    public double calcularJuros(double capital, double taxa){
        return capital*(taxa/100)*12;
    }

    public double calcularJuros(double capital){
        return capital*0.015*12;
    }
}
