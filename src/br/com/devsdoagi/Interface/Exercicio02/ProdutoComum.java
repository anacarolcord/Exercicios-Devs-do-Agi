package br.com.devsdoagi.Interface.Exercicio02;

public class ProdutoComum implements IDescontavel{
    public ProdutoComum(){}

    @Override
    public double calcularPrecoFinal(double precoBase){
        double precoComDesconto = precoBase-(precoBase*0.05);

        return precoComDesconto;
    }
}
