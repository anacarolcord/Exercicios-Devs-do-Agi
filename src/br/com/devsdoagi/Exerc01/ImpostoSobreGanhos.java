package br.com.devsdoagi.Exerc01;

public class ImpostoSobreGanhos {

    public static double calcularImposto(double lucroTotal){

        return (lucroTotal*(0.05)*100) ;
    }



    public static double lucroTotal(double[] precoCompra,double[] precoVenda){
        double []resultado = new double [precoCompra.length];
        double soma =0;
        for(int i=0;i<precoCompra.length;i++) {
            if (precoCompra[i] < precoVenda[i]){
                resultado[i]= precoVenda[i]-precoCompra[i];
                soma+=resultado[i];
            }

        }



        return soma;
    }

    public static double[] lucroPorAtivo(double []precoCompra, double []precoVenda) {
        double [] resultado = new double[precoCompra.length];
        for (int i = 0; i < precoCompra.length; i++) {

            if (precoCompra[i] < precoVenda[i]) {
                resultado[i] = precoVenda[i] - precoCompra[i];
                System.out.println("Lucro obtido: " + resultado[i]);
            } else {
                resultado[i] = precoVenda[i] - precoCompra[i];
                System.out.println("Perda: " + resultado[i]);
            }

        }

        return resultado;
    }

    public static void main(String[] args) {

        double []precoCompra = {100,200,300,400,500};
        double []precoVenda = {10,250,350,450,550};

        lucroPorAtivo(precoCompra,precoVenda);
        System.out.println("O lucro total é: "+(lucroTotal(precoCompra,precoVenda)));
        double lucroTotal = lucroTotal(precoCompra,precoVenda);

        calcularImposto(lucroTotal);
    }

}
