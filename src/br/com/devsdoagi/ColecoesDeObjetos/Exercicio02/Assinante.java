package br.com.devsdoagi.ColecoesDeObjetos.Exercicio02;

import java.util.Objects;

public class Assinante {
    public String id;
    public String nome;
    public String email;

    public Assinante(String id, String nome, String email){
        this.id=id;
        this.nome=nome;
        this.email=email;
    }

    public Assinante(){}

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //sobrescrevendo um metodo do java
    // aqui ele diz que se ISSO:
    // SE A CLASSE QUE ESTAMOS FOR IGUAL AO OBJETO
    // PASSADO NO PARAMETRO RETORNA TRUE!
    //SE O OBJETO PASSADO NO PARAMETRO NAO FOR UMA INSTANCIA DA CLASSE RETORNA FALSE
    //AI INSTANCIA A CLASSE PASSANDO O OBJETO DO PARAMETRO PRA ELA E DANDO O NOME DE assinante
    //O METODO RETORNA ELE PROPRIO CONFERINDO SE O EMAIL DA CLASSE É IGUAL AO EMAIL DO OBJETO PASSADO

    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Assinante)) return false;
        Assinante assinante = (Assinante) o;
        return email.equals(assinante.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
