package Parking;

/*
    Made by     PatrickSys
    PACKAGE     Parking
    Date        23/01/2021
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class ParkingTest_Patrick_Rossello {



    public static void main(String[] args) {

        Parking_Patrick_Rossello parking= new Parking_Patrick_Rossello(9,9 );

        try{ //Si li passam un fitxer com a paràmetre el llegirà
        if(args.length>0) parking.llegirMatricules(args[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner= new Scanner(System.in);
        String path;
        String matricula;
        int opcio;
        boolean exit=false;



       do {

           try {

               System.out.println("\n---Administració del parking---\n");
               System.out.println("1. Omplir parking a partir del fitxer");
               System.out.println("2. Entrar Cotxe");
               System.out.println("3. Entrar Cotxe Discapacitat");
               System.out.println("4. Surtir Cotxe");
               System.out.println("5. Surtir Cotxe Discapacitat");
               System.out.println("6. Guardar llistat de matricules en fitxer");
               System.out.println("7. Sortir");

               opcio = scanner.nextInt();
               scanner.nextLine(); //"refrescam" l'scanner

               switch (opcio) {
                   case 1 -> {
                       System.out.println("Introdueix el path: ");
                       path = scanner.nextLine();
                       parking.llegirMatricules(path);
                   }
                   case 2 -> {
                       System.out.println("Introdueix la matricula: ");
                       matricula = scanner.nextLine();
                       parking.entraCotxe(matricula);
                   }
                   case 3 -> {
                       System.out.println("Introdueix la matricula de discapacitat: ");
                       matricula = scanner.nextLine();
                       parking.entraCotxeDiscapacitat(matricula);
                   }
                   case 4 -> {
                       System.out.println("Introdueix la matricula: ");
                       matricula = scanner.nextLine();
                       parking.surtCotxe(matricula);
                   }
                   case 5 -> {
                       System.out.println("Introdueix la matricula de discapacitat: ");
                       matricula = scanner.nextLine();
                       parking.surtCotxeDiscapacitat(matricula);
                   }
                   case 6 -> {
                       System.out.println("Introdueix el path: ");
                       path = scanner.nextLine();
                       parking.guardarMatricules(path);
                   }
                   case 7 -> {
                       System.out.println("Sortint del programa...");
                       exit = true;
                   }
               }



           } catch (InputMismatchException e) {
                e.printStackTrace();
               scanner.nextLine();


           }
           catch (Exception f){
               f.printStackTrace();
           }



       }while(!exit);

    }

}



