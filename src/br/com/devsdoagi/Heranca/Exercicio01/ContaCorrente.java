package br.com.devsdoagi.Heranca.Exercicio01;

public class ContaCorrente extends HerancaContaBancaria{

    protected double limiteChequeEspecial;

    public ContaCorrente(){
        super();
        this.limiteChequeEspecial=400;
    }

    public double getLimiteChequeEspecial(){
        return this.limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial){
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double sacarComChequeEspecial(double valor){
        double saque=0;

        if (valor>this.limiteChequeEspecial){
            System.out.println("Você ultrapassou o limite!");
        }else{
            this.limiteChequeEspecial-=valor;
        }

        return this.limiteChequeEspecial;
    }

    public void exibirInfo(){

    }
}
