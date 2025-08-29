package br.com.devsdoagi.ColecoesDeObjetos.Exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void exibirLista(Set<Assinante>assinantes){
        for (Assinante assinante : assinantes) {
            System.out.println(assinante.getNome());
        }

    }
    public static void main(String[] args) {
        Set<Assinante> assinantes = new HashSet<>();
        Assinante assinante1 = new Assinante("355","Ana","anacarolina@gmail.com");
        Assinante assinante2 = new Assinante("243","Wesley","wesleynascimento@gmail.com");
        Assinante assinante3 = new Assinante("168","Sarah","anacarolina@gmail.com");

        assinantes.add(assinante1);
        assinantes.add(assinante2);
        assinantes.add(assinante3);

        exibirLista(assinantes);

    }
}
