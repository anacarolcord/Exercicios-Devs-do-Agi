package br.com.devsdoagi.ColecoesDeObjetos.Exercicio01;

import java.util.List;

public class Cliente {
    public String id;
    public String nome;
    public String cpf;

    public Cliente(String id, String nome, String cpf){
        this.id=id;
        this.nome=nome;
        this.cpf=cpf;
    }

    public Cliente(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


}
