package br.com.devsdoagi.HackatonSistemaBancario;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Carolina Cordeiro","462.084.418-70");
        Conta cc= new ContaCorrente("1234-5",2000,cliente1.getNome());
        Conta cp=new ContaPoupanca("1234",1000,cliente1.getNome());


        System.out.println("\n*********** Conta Corrente ***********\n");

        cc.depositar(500);
        System.out.println(" ");
        cc.aplicarJuros();
        System.out.println(" ");
        cc.sacar(350);
        System.out.println("\n");

        System.out.println("*********** Conta Poupança ***********\n");

        cp.depositar(500);
        System.out.println(" ");
        cp.aplicarJuros();
        System.out.println(" ");
        cp.sacar(350);
        System.out.println("\n");
    }





}
