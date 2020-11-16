package Menus;

import java.util.Scanner;
public class excsmenus {
    public static void main(String[] args) {
        menu();
        crear();
        cercar();
        canviar();
        baixa();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; //opcion que ha elegido el usuario

        while (!salir) {
            System.out.println("Menú 1:");
            System.out.println("Opción 1:");
            System.out.println("Opción 2: Restar 2 numeros");
            System.out.println("Opción 3: Restar 2 numeros");
            System.out.println("Opción 4: Dar de baja");
            System.out.println("Salir del sistema");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("crea!");
                    crear();
                    break;
                case 2:
                    System.out.println("cerca!");
                    cercar();
                    break;
                case 3:
                    System.out.println("Canviar contrsenya");
                    canviar();
                    break;
                case 4:
                    System.out.println("Donar de baixa");
                    baixa();
                case 5:
                    System.out.println("Salir");
                    salir = true;
                    break;
                default:
                    System.out.println("Selecciona un número entre 1 y 4");


            }
        }
    }

    private static void crear() {

    }

    private static void cercar() {

    }

    private static void canviar() {

    }

    private static void baixa() {

    }
}