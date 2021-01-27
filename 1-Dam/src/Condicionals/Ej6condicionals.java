package Condicionals;

import java.util.Scanner;



public class Ej6condicionals {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce the height: ");
        double height = scanner.nextDouble();
        double t=Math.sqrt((2*height/9.81));
        System.out.println(t);

    }
}
