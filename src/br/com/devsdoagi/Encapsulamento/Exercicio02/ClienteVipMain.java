package br.com.devsdoagi.Encapsulamento.Exercicio02;

public class ClienteVipMain {
    public static void main(String[] args) {
        ClienteVip clienteVip = new ClienteVip();

        clienteVip.setNome("Ana Carolina Cordeiro");
        clienteVip.setCpf("229.382.092-6");
        clienteVip.setLimiteCredito(2000);

        clienteVip.exibirCliente();
    }
}
