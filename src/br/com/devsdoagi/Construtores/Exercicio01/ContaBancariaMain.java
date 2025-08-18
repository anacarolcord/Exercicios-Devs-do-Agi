package br.com.devsdoagi.Construtores.Exercicio01;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaBancaria();
        ContaBancaria cb2 = new ContaBancaria("Ana","8989839-3");
        ContaBancaria cb3 = new ContaBancaria("Luan"," 7398729-x",1200);

        cb1.exibirConta();
        cb2.exibirConta();
        cb3.exibirConta();





    }
}
