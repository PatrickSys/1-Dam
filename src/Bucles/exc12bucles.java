package Bucles;

import java.util.Scanner;
public class exc12bucles {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int vegades=scanner.nextInt();
        int x=0;
        int x1=1;
        System.out.println("introdueix el la quantitat de dígits que vols conéixer");
        for (int i = 0; i<vegades; i++){
            int x2=x;
            x=x1+x;
            x1=x2;

                System.out.println(x1);

        }

    }
}