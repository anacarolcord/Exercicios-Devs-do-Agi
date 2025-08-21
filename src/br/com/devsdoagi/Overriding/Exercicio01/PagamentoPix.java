package br.com.devsdoagi.Overriding.Exercicio01;

public class PagamentoPix extends Pagamento{
    public String chavePix;

    public PagamentoPix(double valor, String chavePix){
        super(valor);
        this.chavePix=chavePix;
    }

    public String getChavePix(){
        return this.chavePix;
    }

    public void setChavePix(String chavePix){
        this.chavePix=chavePix;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Processando pagamento com pix"+getValor()+ "chave "+getChavePix());
    }
}
