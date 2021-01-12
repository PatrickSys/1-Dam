package Bucles;

public class BubbleSort {


    public static void main(String[] args) {
        int[] matriu = {29, 25, 39, 20, 18}; //array per a ordenar
        int a;

            for (int i = 0; i < matriu.length-1; i++) {
                if (matriu[i+1] < matriu[i]) {        //si el num agafat és menor al següent
                    a = matriu[i ];                      //assigna 29 a a
                    matriu[i] = matriu[i+1];              //assigna 25 a 29
                    matriu[i+1] = a;                        //assigna 29 a 25
                    for (int j = 0; j < matriu.length; j++) {
                        System.out.println(matriu[j] + " iteració " + j);
                    }
                    System.out.println("\n");
                }

            }
    }
}
