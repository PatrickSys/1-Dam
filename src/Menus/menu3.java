package Menus;
import java.util.Scanner;



public class menu3 {




    public static void menu(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion; //opcion que ha elegido el usuario

        while (!salir) {
            System.out.println("Opción 1: Gestió d'empleats RRHH");
            System.out.println("Opción 2: Gestió de productes");
            System.out.println("Opción 3: Gestió de compra/vendes");
            System.out.println("Opción 4:Salir del sistema");
            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("RRH!");
                    System.out.println("Opció 1.1: Donar d'alta un empleat");
                    System.out.println("Opció 1.2: Modificar un empleat");
                    System.out.println("Opció 1.3: Donar de baixa un empleat");
                    opcion=scanner.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("Donar d'alta un empleat");
                            alta();
                            break;
                        case 2:
                            System.out.println("Modificar un empleat");
                            modificar();
                            break;
                        case 3:
                            System.out.println("Donar de baixa un empleat");
                            baixa();
                        default:
                            System.out.println("Selecciona un número entre 1 i 3");
                    }
                    break;
                case 2:
                    System.out.println("Gestió de productes!");
                    System.out.println("Opció 2.1: Donar d'alta un producte");
                    System.out.println("Opció 2.2: Modificar un producte");
                    System.out.println("Opció 2.3: Donar de baixa un producte");
                    opcion=scanner.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("Donar d'alta un producte");
                            alta();
                            break;
                        case 2:
                            System.out.println("Modificar un producte");
                            modificar();
                            break;
                        case 3:
                            System.out.println("Donar de baixa un producte");
                            baixa();
                            break;
                        default:
                            System.out.println("Selecciona un número entre 1 i 3");
                    }
                    break;
                case 3:
                    System.out.println("Gestió de compra/venda");
                    System.out.println("Opció 3.1: Gestió de comandes");
                    System.out.println("Opció 3.2: Veure estadístiques i gràfics");
                    switch(opcion){
                        case 1:
                            System.out.println("Gestió de comandes!");
                            comandes();
                            break;
                        case 2:
                            System.out.println("Estadístiques i gràfics!");
                            stats();
                            break;
                        default:
                            System.out.println("Selecciona un número entre 1 i 3");
                    }
                    break;
                case 4:
                    System.out.println("Salir");
                    salir = true;
                    break;
                default:
                    System.out.println("Selecciona un número entre 1 y 4");


            }
        }
    }

    private static void alta() {

    }

    private static void modificar() {

    }

    private static void baixa() {

    }

    private static  void comandes() {

    }

    private static void stats(){

    }
}



