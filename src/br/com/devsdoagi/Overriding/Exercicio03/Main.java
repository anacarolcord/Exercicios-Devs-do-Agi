package br.com.devsdoagi.Overriding.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Emprestimo emprestimo = new EmprestimoPessoal();
        emprestimo.setValorEmprestado(2000);
        System.out.println(emprestimo.calcularParcela(12));

    }
}
