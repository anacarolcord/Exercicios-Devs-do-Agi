package br.com.devsdoagi.POO.Exercicio05;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome="Ana Carolina";
        funcionario.salarioBruto=2500;
        funcionario.descontoINSS=(funcionario.salarioBruto*0.09);
        funcionario.descontoIR=(funcionario.salarioBruto*0.05);

        funcionario.calcularSalarioLiquido();
        funcionario.exibirFolhaPagamento();
    }
}
