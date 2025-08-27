package br.com.devsdoagi.Colecoes;
import java.util.*;

public class Emprestimos {
    public static void main(String[] args) {
        Map<String, List<Double>> emprestimos = new HashMap<>();
        List<Double> valorParcelas = new ArrayList<>();

        adicionarParcela(emprestimos,"3456",45);
        adicionarParcela(emprestimos,"3456",50);
        adicionarParcela(emprestimos,"3456",55);

        
    }


    public static void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorParcela){
        List<Double> parcelas = new ArrayList<>();
        parcelas.add(valorParcela);
        emprestimos.put(cpf,parcelas);
    }

}
