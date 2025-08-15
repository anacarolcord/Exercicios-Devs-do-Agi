package br.com.devsdoagi.POO.Exercicio03;

public class Aluno {

    public String nome;
    public double nota1;
    public double nota2;

    public Aluno (){
        this.nome= "Ana";
        this.nota1=7;
        this.nota2=3;

    }

    public double calcularMedia(){

        return (this.nota1+ this.nota2)/2;
    }

    public String verificarSituacao(){
        String resultado;
        if(this.calcularMedia()<4){
            resultado = "Reprovado";
        }else if(this.calcularMedia()>5){
            resultado="Aprovado";
        }else
            resultado = "Recuperação";

        return resultado;
    }

    public void exibirRelatorio(){
        System.out.println("Nome do Aluno: "+this.nome);
        System.out.println("Média: "+this.calcularMedia());
        System.out.println("Situação: "+this.verificarSituacao());
    }
}
