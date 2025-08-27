package br.com.devsdoagi.Colecoes.Exercicio01;
import java.util.HashSet;
import java.util.Set;

public class ContasBancarias {
    public static void main(String[] args) {
        Set<Integer> contas = new HashSet<>();

        adicionarConta(contas,1234);
        adicionarConta(contas,5678);
        adicionarConta(contas,9982);
        adicionarConta(contas,1234);


        System.out.println(existeConta(contas,9031));
        System.out.println();

        exibirContas(contas);


        }

   public static void adicionarConta(Set<Integer> contas, int numeroConta){
       if(contas.add(numeroConta)){
           System.out.println("Conta "+numeroConta+" adicionada.");
       }else{
           System.out.println("Conta ja existente.");
       }
   }

   public static boolean existeConta(Set<Integer> contas, int numeroConta){
       return contas.contains(numeroConta);
   }

   public static void exibirContas(Set<Integer> contas){
       System.out.println("Exibindo contas: "+contas);
   }
}
