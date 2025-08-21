package br.com.devsdoagi.ClassesAbstratas.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("5439-0",300);
        Conta cp=new ContaPoupanca("13973-x",300);

        cp.atualizarMensal();
        cc.atualizarMensal();
    }
}
