package br.com.devsdoagi.Encapsulamento.Exercicio03;

public class InvestimentoFinanceiro {
    private String tipoInvestimento;
    private double valorInicial;
    private double taxaAnual;

    public String getTipoInvestimento(){
        return this.tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento){
        this.tipoInvestimento=tipoInvestimento;
    }

    public double getValorInicial(){
        return this.valorInicial;
    }

    public void setValorInicial(double valorInicial){
        if(valorInicial<1000){
            System.out.println("O valor inicial é menor que R$1.000,00");
        }else {
            this.valorInicial = valorInicial;
        }
    }

    public double getTaxaAnual(){
        return this.taxaAnual;
    }

    public void setTaxaAnual(double taxaAnual){
        if(taxaAnual >=0.01 && taxaAnual<=0.20) {
            this.taxaAnual = taxaAnual;
        }else{
            System.out.println("A taxa está fora dos limites!!");
        }
    }

    public double calcularValorFuturo(int anos){
            double valorFuturo=0;
            valorFuturo=this.valorInicial *(Math.pow((1+ taxaAnual),anos));
            System.out.println(valorFuturo);
        return valorFuturo;
    }

    public void exibirResumo(){
        System.out.println("Tipo de investimento: "+getTipoInvestimento());
        System.out.println("Valor Inicial: "+getValorInicial());
        System.out.println("Taxa anual: "+getTaxaAnual());
        System.out.println("Valor futuro: ");

    }
}
