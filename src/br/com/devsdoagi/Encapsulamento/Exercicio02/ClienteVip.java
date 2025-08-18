package br.com.devsdoagi.Encapsulamento.Exercicio02;

public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public double getLimiteCredito(){
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito){

        if(limiteCredito>=1000 && limiteCredito <=100000){
            this.limiteCredito=limiteCredito;
        }else{
            System.out.println("Limite fora do valor padrão!!");
        }
    }

    public void exibirCliente(){
        System.out.println("Nome do cliente: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Limite: "+getLimiteCredito());
    }


}
