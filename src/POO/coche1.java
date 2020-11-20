package POO;

import java.util.Scanner;

public class coche1 {


    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    coche micoche= new coche();

    micoche.setColor("azul"); //passam parametre a set
        System.out.println(micoche.getColor());

    coche micoche1= new coche("ruinolt", 90);  //assignam valors a instància micoche1 i feim get valors
        System.out.println(micoche1.getV());
        System.out.println(micoche1.getElnom());


    }




}


   /* coche renault=new coche(); //instanciar una classe, objecte-instància de classe coche


        System.out.println("el cotxe té " + renault.getruedas() + " rodes" + " i és un vehicle " + renault.getvehiculo()); //objeto.atributo per referir-nos a ell


        System.out.println("cuantas ruedas tiene un renault?");

        */