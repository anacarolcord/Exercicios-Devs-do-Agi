package br.com.devsdoagi.ColecoesDeObjetos.Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        armazenarCliente(clientes,"1234","Ana","456.232.222-70");
        armazenarCliente(clientes,"5678","Nayani","126.232.222-70");
        armazenarCliente(clientes,"9088","Lucas","126.232.222-70");

        ordenarClientes(clientes);
    }


    //a verificação para conferir se ja existe um cliente eh mais complexa
    //pois o compilador entende que objetos com o mesmo conteudo, são objetos diferentes!!!

    public static void armazenarCliente(List<Cliente> clientes, String id, String nome, String cpf) {
        Cliente cliente = new Cliente(id,nome,cpf);
        clientes.add(cliente);
    }

    public static void ordenarClientes(List<Cliente> clientes) {
        for (int i = 0; i < clientes.size(); i++) {
            int ordenar = clientes.indexOf(new Cliente()) + (i + 1);

            System.out.println(" " + ordenar + " " + clientes.get(i).getNome() + " " + clientes.get(i).getCpf());

        }
    }


    public static void buscarCPF(List<Cliente> cliente, String cpf){
        
    }

}








