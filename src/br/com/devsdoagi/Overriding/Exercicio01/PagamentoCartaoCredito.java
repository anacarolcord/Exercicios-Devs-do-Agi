package br.com.devsdoagi.Overriding.Exercicio01;

public class PagamentoCartaoCredito extends Pagamento{
    public String numeroCartao;

    public PagamentoCartaoCredito(double valor,String numeroCartao){
        super(valor);
        this.numeroCartao=numeroCartao;
    }

    public String getNumeroCartao(){
        return this.numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao){
        this.numeroCartao=numeroCartao;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Processando pagamento no valor "+valor+" com o cartão de crédito nº "+getNumeroCartao());
    }



}
