package br.com.devsdoagi.ColecoesDeObjetos.Exercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void exibirProdutos(Map<String, Produto> produtos) {
        Produto prod = new Produto();
        //fazer um foreach aqui!!!
        System.out.println("Código: "+produtos.keySet()+"\nNome: "+prod.getNome()+"\nQuantidade: "+prod.getQuantidade());

    }

    public static void consultarProduto(Map<String,Produto> produtos, String codigo) {
        if(!produtos.containsKey(codigo)){
            System.out.println("Produto inexistente!");
        }else{
            System.out.println("O código "+codigo+" refere-se ao produto: "+produtos.get(codigo).getNome());

        }
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("1234","biscoito",40);
        Produto produto2 = new Produto("3466","danone",95);
        Produto produto3 = new Produto("6230","chocolate",90);
        Produto produto4 = new Produto("4789","bolo",34);
        Produto produto5 = new Produto("1234","biscoito",90);


        Map<String,Produto> produtos = new HashMap<>();

        produtos.put(produto1.getCodigo(), produto1);
        produtos.put(produto2.getCodigo(), produto2);
        produtos.put(produto3.getCodigo(), produto3);
        produtos.put(produto4.getCodigo(), produto4);
        produtos.put(produto5.getCodigo(), produto5);

        consultarProduto(produtos, "630");
        exibirProdutos(produtos);


    }
}
