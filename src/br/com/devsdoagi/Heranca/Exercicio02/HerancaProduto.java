package br.com.devsdoagi.Heranca.Exercicio02;

public class HerancaProduto {

    private String codigo;
    private String nomeProduto;
    private double precoProduto;

    public HerancaProduto(String codigo,String nomeProduto,double precoProduto){
        this.codigo=codigo;
        this.nomeProduto=nomeProduto;
        this.precoProduto=precoProduto;
    }



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto=nomeProduto;
    }

    public double getPrecoProduto(){
        return this.precoProduto;
    }

    public void setPrecoProduto(double precoProduto){
        this.precoProduto=precoProduto;
    }
}
