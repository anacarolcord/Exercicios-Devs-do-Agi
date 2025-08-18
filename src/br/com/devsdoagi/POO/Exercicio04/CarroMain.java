package br.com.devsdoagi.POO.Exercicio04;

public class CarroMain {
    public static void main(String[] args) {

        Carro meuCarro;
        meuCarro = new Carro();


        double distancia =45;
        meuCarro.calcularConsumo(distancia);
        meuCarro.exibirDados(distancia);

        meuCarro.modelo="Fiat Uno";
        meuCarro.consumoPorKm=70;

        meuCarro.calcularConsumo(distancia);
        meuCarro.exibirDados(distancia);
    }
}
