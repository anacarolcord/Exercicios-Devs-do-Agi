package br.com.devsdoagi.Encapsulamento.Exercicio03;

public class InvestimentoFinanceiroMain {
    public static void main(String[] args) {
        InvestimentoFinanceiro invest = new InvestimentoFinanceiro();

        invest.setTipoInvestimento("Tesouro Direto");
        invest.setTaxaAnual(0.2);
        invest.setValorInicial(1200);
        invest.exibirResumo();
        invest.calcularValorFuturo(1);

    }
}
