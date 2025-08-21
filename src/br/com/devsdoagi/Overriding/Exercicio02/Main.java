package br.com.devsdoagi.Overriding.Exercicio02;

public class Main {
    public static void main(String[] args) {
        Investimento[] investimento = new Investimento[2];
        Poupanca[] poupanca = new Poupanca[2];
        CDB[] cdb = new CDB[2];


        investimento[0]= new Investimento(200);
        investimento[1]=new Investimento(300);

        for (int i = 0; i < investimento.length; i++) {
            double resultado = investimento[i].calcularRendimento();
            System.out.println("Total rendimento do investimento "+(i+1)+" R$"+resultado);
        }

        poupanca[0]=new Poupanca(200);
        poupanca[1]=new Poupanca(300);

        for (int i = 0; i < poupanca.length; i++) {
            double resultado = poupanca[i].calcularRendimento();
            System.out.println("Total rendimento poupanca "+(i+1)+" R$"+resultado);
        }

        cdb[0]=new CDB(200);
        cdb[1]=new CDB(300);

        for (int i = 0; i < cdb.length; i++) {
            double resultado = cdb[i].calcularRendimento();
            System.out.println("Total rendimento do CDB "+(i+1)+" R$"+resultado);
        }





    }
}
