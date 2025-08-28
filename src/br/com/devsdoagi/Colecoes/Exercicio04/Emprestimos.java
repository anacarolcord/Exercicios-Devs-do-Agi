package br.com.devsdoagi.Colecoes.Exercicio04;
import java.util.*;

public class Emprestimos {
    public static void main(String[] args) {
        Map<String, List<Double>> emprestimos = new HashMap<>();
        List<Double> valorParcelas = new ArrayList<>();

        adicionarParcela(emprestimos,"3456",300);
        adicionarParcela(emprestimos,"3456",300);
        totalDevedor(emprestimos,"3456");
        System.out.println(totalDevedor(emprestimos,"3456"));

        exibirRelatorioDevedor(emprestimos);
    }

    public static double totalDevedor(Map<String, List<Double>> emprestimos, String cpf){
        List<Double> parcelas = emprestimos.get(cpf);
        double total=0;
        for(int i =0;i<parcelas.size();i++){
            total += parcelas.get(i);
        }

        return total;

    }

    public static void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorParcela){
        if(!emprestimos.containsKey(cpf)){
            List<Double> parcelas = new ArrayList<>();
            parcelas.add(valorParcela);
            emprestimos.put(cpf, parcelas);
        }else{
            emprestimos.get(cpf).add(valorParcela);
        }

    }

    public static void exibirRelatorioDevedor(Map<String, List<Double>> emprestimos){
        System.out.println("Exibindo relatório referente ao CPF: "+emprestimos.keySet()+"\nValores: "+emprestimos.values());
    }



}
