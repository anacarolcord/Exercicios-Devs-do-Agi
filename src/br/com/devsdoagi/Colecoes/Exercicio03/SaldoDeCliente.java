package br.com.devsdoagi.Colecoes.Exercicio03;
import java.util.*;

public class SaldoDeCliente {

    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<>();

        adicionarCliente(contas,"6544-0",2000);
        depositar(contas,"6544-0",600);
        exibirSaldos(contas);
        depositar(contas,"644-0",600);
    }

    public static void adicionarCliente(Map<String,Double> contas, String numeroConta, double saldoInicial){
        contas.put(numeroConta,saldoInicial);
        System.out.println(contas.put(numeroConta,saldoInicial));
    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double valor){
        if(!contas.containsKey(numeroConta)){
        System.out.println("Conta não existe!");
        }else {
            contas.replace(numeroConta, valor += contas.get(numeroConta));
            System.out.println(contas.put(numeroConta, valor));
        }
    }

    public static void exibirSaldos(Map<String, Double> contas) {
        System.out.println("Contas: " + contas.keySet());
        System.out.println("Valores: "+ contas.values());
    }
}
