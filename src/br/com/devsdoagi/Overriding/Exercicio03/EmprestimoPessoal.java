package br.com.devsdoagi.Overriding.Exercicio03;

public class EmprestimoPessoal extends Emprestimo{
    public EmprestimoPessoal(){}

    @Override
    public double calcularParcela(int meses){

        double juros=(getValorEmprestado()*0.02);
        double resultado = (getValorEmprestado()+juros)/meses;

        return resultado;
    }
}
