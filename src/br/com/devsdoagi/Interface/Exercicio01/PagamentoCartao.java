package br.com.devsdoagi.Interface.Exercicio01;

public class PagamentoCartao implements IPagamento{
    public PagamentoCartao(){}

    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$"+valor+" realizado via cartão de crédito");
    }
}
