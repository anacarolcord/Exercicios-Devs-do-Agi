package br.com.devsdoagi.POO.Exercicio01;
import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto;
        produto = new Produto();


        produto.preco = 34.89;
       produto.nome = "Arroz";

       produto.exibirDados();

       produto.adicionarEstoque(7);

       produto.exibirDados();

       produto.removerEstoque(3);

       produto.exibirDados();
    }

}
