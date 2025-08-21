package br.com.devsdoagi.Interface.Exercicio02;

public class ProdutoPromocional implements IDescontavel{
    public ProdutoPromocional(){}

    @Override
    public double calcularPrecoFinal(double precoBase) {

        double precoComDesconto = precoBase-(precoBase*0.20);

        return precoComDesconto;

    }
}
