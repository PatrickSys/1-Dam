package Condicionals;

import java.util.Scanner;

public class Ej9Condicionals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el valor de a, b i c separats per , :");
        String valores = scanner.nextLine();
        String[] numeros = valores.split(",");
        int a=Integer.parseInt(numeros[0]);
        int b=Integer.parseInt(numeros[1]);
        int c=Integer.parseInt(numeros[2]);

        double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);

        double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        //imprime los valores

        System.out.println("La solucion de x1: "+x1);

        System.out.println("La solucion de x2: "+x2);
    }
}
