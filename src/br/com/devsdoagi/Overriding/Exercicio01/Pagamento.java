package br.com.devsdoagi.Overriding.Exercicio01;

public class Pagamento {
    public double valor;

    public Pagamento(double valor){
        this.valor=valor;
    }
    public Pagamento(){

    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor=valor;
    }

    public void processarPagamento(){
        System.out.println("Processando pagamento no valor "+valor);
    }
}
