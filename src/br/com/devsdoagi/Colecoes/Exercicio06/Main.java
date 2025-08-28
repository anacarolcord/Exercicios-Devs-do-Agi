package br.com.devsdoagi.Colecoes.Exercicio06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        adicionarCliente(clientes,"Rauni",2300);
        adicionarCliente(clientes,"Nayani",2344);
        adicionarCliente(clientes,"Ana",3000);

        ordernarPorSaldo(clientes);

        exibirClientes(clientes);


    }

    public static void adicionarCliente(List<Cliente> clientes, String nome, double saldo){
        Cliente cliente = new Cliente(nome, saldo);
        clientes.add(cliente);
    }

    public static void ordernarPorSaldo(List<Cliente> clientes){
        clientes.sort((c1, c2) -> Double.compare(c2.saldo, c1.saldo));


    }

    public static void exibirClientes(List<Cliente> clientes){

        for(Cliente cliente : clientes){
        System.out.println("Exibindo cliente "+cliente.getNome()+"\n Saldos: "+ cliente.getSaldo());
        }
    }
}
