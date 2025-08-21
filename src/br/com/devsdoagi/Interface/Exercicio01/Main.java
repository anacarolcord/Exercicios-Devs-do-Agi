package br.com.devsdoagi.Interface.Exercicio01;

public class Main {
    public static void main(String[] args) {
        IPagamento pagamentoBoleto = new PagamentoBoleto();
        IPagamento pagamentoCartao = new PagamentoCartao();

        pagamentoBoleto.processarPagamento(400);
        pagamentoCartao.processarPagamento(300);
    }
}
