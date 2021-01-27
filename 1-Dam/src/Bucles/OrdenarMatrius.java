package Bucles;

public class OrdenarMatrius {



    public static void main(String[] args) {
        int[] matriu = {29, 25, 39, 20}; //array per a ordenar

        int a;
        for (int i = 0; i < matriu.length; i++ ) {//va passant el primer num, agafa 29


            for (int j = 0; j < matriu.length; j++) { //i el compara amb tots es altres

                if(matriu[i]<matriu[j]){ // si es primer num es mes petit que es altres els canvia
                    a=matriu[i]; //assigna a "a" 29
                    matriu[i]=matriu[j]; //assigna el nombre mes petit a la posició on troba el nombre més gran
                    matriu[j]=a; //i assigna el numero mes gran a la posició on troba el numero mes petit

                }

            }

        }
        for (int i=0; i<matriu.length; i++)
        System.out.println(matriu[i]);
    }



}