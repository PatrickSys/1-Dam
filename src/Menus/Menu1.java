package Menus;
import java.util.Scanner;

public class Menu1 {

    private static void menu() {
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;
    int opcion; //opcion que ha elegido el usuario

    while(!salir){
        System.out.println("Opción 1: Sumar 2 numeros");
        System.out.println("Opción 2: Restar 2 numeros");
        System.out.println("Opción 3: Restar 2 numeros");
        System.out.println("Opción 4: Dividir 2 numeros");
        System.out.println("Opción 5: Salir del programa");
        System.out.println("Selecciona una opción: ");
        opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Suma!");
                suma();
                break;
            case 2:
                System.out.println("Resta!");
                resta();
                break;
            case 3:
                System.out.println("Multiplicacion");
                multiplica();
                break;
            case 4:
                System.out.println("Divideix!");
                divideix();
                break;
                case 5:
                System.out.println("Salir");
                salir=true;
                break;
            default:
                System.out.println("Selecciona un número entre 1 y 5");
        }

    }

}

    private static void suma() {

    }

    private static void resta() {

    }
    private static void multiplica(){

    }

    public static void divideix() {

    }

}
