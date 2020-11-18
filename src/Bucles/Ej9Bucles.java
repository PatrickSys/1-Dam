package Bucles;

import java.util.Scanner;

public class Ej9Bucles {
        public static void main(String[] args) {


            Scanner nombre = new Scanner(System.in);

            boolean escorrecte = false;
            while (!escorrecte) try {
                System.out.print("Introduzca un número de 0 a 9: ");
                int numero = nombre.nextInt();
                escorrecte=numero <= 9 && numero >= 0;
                if (escorrecte) { //if que executarà el bucle si el nombre esta entre 0 i 9
                    for (int comptador = 0; comptador < 10; comptador++) {
                        System.out.println(numero + " * " + comptador + " = " + numero * comptador); //bucle for per fer la taula


                    }
                } else {
                    System.out.println("Numero incorrecto, introduzca un número de 0 a 9");

                }

            } catch (java.lang.Throwable e) {
                //Display Error message
                System.out.println("Carácter inválido, por favor, introduzca un número");
                nombre.nextLine();

            }
        }
    }

