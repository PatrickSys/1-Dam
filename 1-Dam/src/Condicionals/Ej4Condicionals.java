package Condicionals;

import java.util.Scanner;
public class Ej4Condicionals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Quantes hores ha treballat? ");
        int workedtime=scanner.nextInt();
        int sou=0;




        if(workedtime<=40){
            sou=workedtime*12;
            System.out.println("El sou setmanal del treballador és de " + sou + " €");
        }
        else {
            sou=((workedtime+(40-workedtime))*12)+((workedtime-40)*16);
            System.out.println("El sou setmanal del treballador és de: " +sou + " €");
        }
    }
    }