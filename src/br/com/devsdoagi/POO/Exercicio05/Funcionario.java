package br.com.devsdoagi.POO.Exercicio05;

public class Funcionario {
    public String nome;
    public static double salarioBruto;
    public static double descontoINSS;
    public static double descontoIR;


    public Funcionario(){

    }

    public double calcularSalarioLiquido() {
        return (Funcionario.salarioBruto - Funcionario.descontoINSS - Funcionario.descontoIR);
    }

    public void exibirFolhaPagamento(){
        System.out.println("=================================================");
        System.out.println("Folha de pagamento do funcionario(a): "+nome);
        System.out.println("Salario bruto: R$"+salarioBruto);
        System.out.println("Desconto INSS: "+descontoINSS);
        System.out.println("Desconto IR: "+descontoIR);
        System.out.println("TOTAL A RECEBER: R$"+calcularSalarioLiquido());
        System.out.println("=================================================");
    }
}
