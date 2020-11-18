package POO;


import org.w3c.dom.ls.LSOutput;

//exemple pseudocode
//classe-plataforma i cream atributs
//private "encapsula" per a que classe no pugui ser modificada externament
public class coche
{
    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;

    private String vehiculo;

    private String color;
    private String elnom;
    int v;
    int peso_total;

    boolean asientos_cuero, climatizador;


    //metode constructor(dóna estat inicial a l'objecte) per assignar valors als atributs de la classe-plataforma
    public coche(){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
        vehiculo="a motor";


    }
    //constructor amb parametres
    public coche(String elnom, int v){
        setElnom(elnom);
        this.v=v;

    }


    //cream getter per obtendre atributs des de fora

    /* si volem string amb valor:
       public String getruedas(){
       return "El coche tiene" +ruedas;
   }
    */
    // si volem només valor:
    public int getruedas(){
        return ruedas;
    }


    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {return motor;}

    public String getElnom() {return elnom;}

    public int getV() {return v;}

    public int getPeso_plataforma() {
        return peso_plataforma;
    }
    public String getvehiculo(){
        return vehiculo;
    }

    //setters per modificar valor atributs, void no retorna
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setElnom(String elnom) {
        this.elnom = elnom;
    }
}
