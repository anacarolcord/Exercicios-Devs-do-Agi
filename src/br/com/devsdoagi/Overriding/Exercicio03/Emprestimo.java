package br.com.devsdoagi.Overriding.Exercicio03;

public class Emprestimo {

    public double valorEmprestado;

    public Emprestimo(){}
    public Emprestimo(double valor){
        this.valorEmprestado=valor;
    }

    public double getValorEmprestado(){
        return this.valorEmprestado;
    }

    public void setValorEmprestado(double valorEmprestado){
        this.valorEmprestado=valorEmprestado;
    }

    public double calcularParcela(int meses){
        return getValorEmprestado()/meses;
    }

}
