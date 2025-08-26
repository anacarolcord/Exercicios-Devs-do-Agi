package br.com.devsdoagi.HackatonCadastro;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;
    }

    public Funcionario(){}

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario) {
        if(salario<0) {
            System.out.println("Valor incorreto!");
        }else{
            this.salario=salario;}
    }

}
