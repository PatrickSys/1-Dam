package Bucles;

public class OrdenarMatrius {



    public static void main(String[] args) {
        int[] matriu = {29, 25, 39, 20}; //array per a ordenar

        for (int i = 1; i < matriu.length; i++ ){ //que ha de fer per ordenar-los
            int n=0;
            if (matriu[i]<matriu[i-1]){ // si 25 es menor a 29
                int a=matriu[i];  //assigna a a 25
                System.out.println(a);
               // matriu[i]=matriu[n];    //assigna 25 a 20
               // matriu[i]=a;
            }


            n++;

        }

       /* for(int i=0; i<matriu.length; i++){
            System.out.println(matriu[i]);
        }*/


    }
}