package br.com.devsdoagi.HackatonCadastro;

import java.sql.SQLOutput;

public class Main1 {
    public static void main(String[] args) {
        Gerente ge = new Gerente("Ana",5000);
        Analista a = new Analista("Sarah",3000);


        System.out.println("\nDados do cargo gerente: ");
        System.out.println("Nome: "+ge.getNome());
        System.out.println("Salário: R$"+ge.getSalario());
        System.out.println("Bonus Fixo: R$"+ge.getBonusFixo());
        System.out.println("\n");
        System.out.println("Dados do cargo analista: ");
        System.out.println("Nome: "+a.getNome());
        System.out.println("Salário: R$"+a.getSalario());
        System.out.println("Bonus Fixo: R$"+a.getBonusFixo());



    }
}
