package br.com.devsdoagi.Heranca.Exercicio02;

public class ProdutoPerecivel extends HerancaProduto {
    public String dataValidade;

    public ProdutoPerecivel(String dataValidade) {
        super(" ", " ", 0.0);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(String dataAtual) {
        if (dataAtual.equals(dataValidade))
            return false;
        else {
            return true;
        }
    }

}