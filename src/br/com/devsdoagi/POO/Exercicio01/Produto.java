package br.com.devsdoagi.POO.Exercicio01;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;



    public void adicionarEstoque(int quantidade){
       this.quantidade+=quantidade;
    }

    public void removerEstoque(int quantidade){
        this.quantidade-=quantidade;
    }

    public void exibirDados(){

        System.out.println("Produto: "+this.nome);
        System.out.println("Quantidade: "+this.quantidade);
        System.out.println("Preço: "+this.preco);
    }

}
