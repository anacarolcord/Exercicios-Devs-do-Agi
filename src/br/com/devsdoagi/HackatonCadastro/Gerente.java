package br.com.devsdoagi.HackatonCadastro;

public class Gerente extends Funcionario{
    private double bonusFixo;

    public Gerente(String nome, double salario){
        super(nome,salario);
        this.bonusFixo=2000;
    }

    public double getBonusFixo() {
        return bonusFixo;
    }
}
