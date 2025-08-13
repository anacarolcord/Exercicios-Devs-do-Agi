package br.com.devsdoagi.Matrizes;
import java.util.Scanner;


public class DividasMensais {

    public static double encontrarMaior(double[][] matriz){

        double maior=matriz[0][0];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }
    public static void main(String[] args) {
        double[][] matriz = {{102,110,150,210},
                              {120,125,130,301},
                              {202,210,250,204}};

        System.out.println(encontrarMaior(matriz));

    }
}
