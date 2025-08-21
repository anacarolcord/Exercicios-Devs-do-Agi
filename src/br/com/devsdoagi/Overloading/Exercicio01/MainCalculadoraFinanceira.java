package br.com.devsdoagi.Overloading.Exercicio01;

public class MainCalculadoraFinanceira {
    public static void main(String[] args) {
        CalculadoraFinanceira cf = new CalculadoraFinanceira();
        cf.calcularJuros(2000);
        cf.calcularJuros(1200,20,24);
        cf.calcularJuros(2000,4.5);

        System.out.println(cf.calcularJuros(2000));
        System.out.println(cf.calcularJuros(1200,20,24));
        System.out.println(cf.calcularJuros(2000,4.5));
    }



}
