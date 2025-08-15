package br.com.devsdoagi.POO.Exercicio04;

public class Carro {

    public String modelo;
    public double consumoPorKm;

    public Carro(){
        this.modelo= "FordKa";
        this.consumoPorKm= 9;
    }

    public double calcularConsumo(double distancia){
        return (this.consumoPorKm/distancia);
    }

    public void exibirDados(double distancia){
        System.out.println("Modelo do veículo: "+this.modelo);

        System.out.println("Consumo por km: "+this.calcularConsumo(distancia));

    }
}
