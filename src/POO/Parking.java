package POO;

import java.util.Scanner;

public class Parking {


    static Scanner scanner = new Scanner(System.in);
    final static int MinTax = 2; //Minimum Tax the parking charges
    final static int OrdinaryTime = 3; //Max ordinary Time for those 2$
    final static int MaxTime = 24; //Max time
    static int MaxCharge = 10;  //Max charge for every client
    static double TimeParked;
    static double charge;
    static int counter;
    static double totalamount;
    public static String customer;


    static double charge() { //mètode per calcular el càrreg del client
        System.out.print("How many customers did we have yesterday?     ");
        int customers = scanner.nextInt();

        for (int i = 0; i < customers; i++) { //bucle for que executarà el nº de customers que hi va haver ahir
            System.out.print("What's the name for this customer?    ");
            customer = scanner.nextLine();
            customer = scanner.nextLine();
            System.out.print("How many hours did " + customer + " park?   ");
            TimeParked = scanner.nextDouble();
            if (TimeParked > 0 && TimeParked <= OrdinaryTime) { //dóna valor 2 a charge si no hem passat de 3h
                charge = MinTax;

            }   //codi per a obtenir charge si passam de 3h

            else if (TimeParked > OrdinaryTime && TimeParked <= MaxTime) { //Si temps aparcat és major a l'ordinari i menor al maxim calcula charge

                charge = MinTax;

                for (counter = 3; counter < TimeParked; counter++) { //Fins que comptador arribi al temps aparcat, sumam 0.5 per cada hora
                    charge += 0.5;
                    setCharge(charge);
                    if (charge>=MaxCharge){ //us MaxCharge o 24 directament?
                        setCharge(MaxCharge);
                    }
                }

            }
            totalamount += charge; //actualitza totalamount
            System.out.println(customer + " charge is : " + charge + " $");

        }

        return charge;

    }

    public static void main(String[] args) {

        charge();
        System.out.println("Total amount for yesterday: " + totalamount + " $");

    }


    public static void setCharge(double charge) {
        Parking.charge = charge;
    }

}









