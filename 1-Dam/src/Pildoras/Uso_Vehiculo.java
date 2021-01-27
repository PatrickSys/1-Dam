package Pildoras;

public class Uso_Vehiculo {


    public static void main(String[] args) {


        Coche dacia= new Coche();

        dacia.establece_color("rojo");
        dacia.dime_color();

        Furgoneta dokker = new Furgoneta(7,480);

        dokker.establece_color("Amarillo cani");
        dokker.configura_asientos("si");
        dokker.configura_climatizador("si");

        System.out.println(dacia.dime_datos_generales() + " " + dacia.dime_color());
        System.out.println(dokker.dimeDatosFurgoneta()+ " " +dokker.dime_color());


    }
}
