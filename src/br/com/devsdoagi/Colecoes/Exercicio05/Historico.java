package br.com.devsdoagi.Colecoes.Exercicio05;
import java.util.ArrayList;
import java.util.List;

public class Historico {
    public static void main(String[] args) {
        List<String> historico = new ArrayList<>();

        registrarTransacao(historico,"Compra de R$30,00 efetuada com sucesso");
        registrarTransacao(historico,"Compra de R$120,00 efetuada com sucesso");

        boolean feito = buscarTransacao(historico,"er0");
        System.out.println(feito?" Transaçao realizada!":"Transaçao nao encontrada!");
        feito = buscarTransacao(historico,"Compra de R$120,00 efetuada com sucesso");
        System.out.println(feito?" Transaçao realizada!":"Transaçao nao encontrada!");

        exibirHistorico(historico);

        registrarTransacao(historico,"Compra de R$450,00 efetuada com sucesso");

        exibirHistorico(historico);

    }

    public static void registrarTransacao(List<String> historico, String transacao){
        historico.add(transacao);
    }

    public static boolean buscarTransacao(List<String> historico, String transacao){
        if(!historico.contains(transacao)){
            return false;
        }else {
            return true;
        }
    }

    public static void exibirHistorico(List<String> historico){
        for(int i=0;i<historico.size();i++){
            System.out.println(historico.get(i));
        }
    }
}
