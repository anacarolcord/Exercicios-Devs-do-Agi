package br.com.devsdoagi.HackatonCadastro;

public class Analista extends Funcionario{
    private double bonusFixo;

    public Analista(String nome, double salario){
        super(nome, salario);
        this.bonusFixo=1000;
    }

    public double getBonusFixo() {
        return bonusFixo;
    }


}
