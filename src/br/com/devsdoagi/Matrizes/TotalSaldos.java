package br.com.devsdoagi.Matrizes;

public class TotalSaldos {
    public static double[][] calcularMediaPorCliente(double [][] saldos){
        double[][] soma= new double[saldos.length][saldos.length];
        int i,j;
        for (i=0;i<saldos.length;i++) {

            for (j=0;j<i;j++){

                soma[i][j]+=saldos[i][j];
                System.out.println("Total do cliente "+(i+1)+" "+soma[i][j]);
            }





        }

        return soma;


    }





    public static double calcularTotal(double [][]saldos){
        double soma = 0;
        for(int i=0; i< saldos.length;i++){
            for(int j=0;j<saldos[i].length;j++){
                soma+=saldos[i][j];

            }
        }
        return soma;
    }

    public static void main(String[] args) {
        double [][]saldos = {{455,1000},
                            {109,300},
                            {1300,800}};


        calcularMediaPorCliente(saldos);
    }
}
