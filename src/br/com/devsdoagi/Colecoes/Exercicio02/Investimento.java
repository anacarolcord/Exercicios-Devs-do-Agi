package br.com.devsdoagi.Colecoes.Exercicio02;
import br.com.devsdoagi.Overriding.Exercicio02.CDB;

import java.util.Set;
import java.util.HashSet;

public class Investimento {
    public static void main(String[] args) {
        HashSet<String> produtos = new HashSet<>();

        adicionarProduto(produtos,"CDB");
        adicionarProduto(produtos,"TESOURO DIRETO");
        adicionarProduto(produtos,"CRIPTOMOEDA");
        adicionarProduto(produtos,"CRIPTOMOEDA");

        exibirProdutos(produtos,"CDB");
    }

    public static void adicionarProduto(Set<String> produtos, String nomeProduto){
        if(produtos.add(nomeProduto)){
            System.out.println("Produto "+nomeProduto+" adicionado!");
        }else{
            System.out.println("Produto "+nomeProduto+" ja existe!");
        }
    }

    public static void exibirProdutos(Set<String> produtos, String nomeProdutos){
        System.out.println("Exibindo produtos: "+produtos);
    }
}
