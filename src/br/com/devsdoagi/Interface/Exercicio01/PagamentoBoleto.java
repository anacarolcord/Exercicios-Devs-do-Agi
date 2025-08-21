package br.com.devsdoagi.Interface.Exercicio01;

public class PagamentoBoleto implements IPagamento{
    public PagamentoBoleto(){}

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$"+valor+" realizado via boleto bancário");
    }
}
