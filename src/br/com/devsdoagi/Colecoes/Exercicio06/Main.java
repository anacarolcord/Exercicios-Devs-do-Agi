package br.com.devsdoagi.Colecoes.Exercicio06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();


    }

    public static void adicionarCliente(List<Cliente> clientes, String nome, double saldo){
        Cliente cliente = new Cliente(nome, saldo);
        clientes.add(cliente);
    }

    public static void ordernarPorSaldo(List<Cliente> clientes){
       
    }
}
