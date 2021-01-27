package Pildoras;



//classe-plataforma i cream atributs
//private "encapsula" per a que classe no pugui ser modificada externament
public class Coche
{
    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int peso_plataforma;

    private String vehiculo;

    private String color;

    private int peso_total;

    private boolean asientos_cuero, climatizador;


    //metode constructor(dóna estat inicial a l'objecte) per assignar valors als atributs de la classe-plataforma
    public Coche(){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;


    }

    public String dime_datos_generales(){   //Getter
        return "La plataforma del vehículo tiene " +ruedas + " ruedas " + ", mide " + largo + "mm de largo, con un ancho de vías de " + ancho + "mm,  el peso de la plataforma es de " + peso_plataforma +" kg";

    }


    public void establece_color(String color) {
        this.color = color;
    }
    public String dime_color(){
        return "El color del coche es " +color;
    }
    public void configura_asientos(String asientos_cuero){
        if(asientos_cuero.equalsIgnoreCase("si")){
            this.asientos_cuero=true;
        }
        else{
            this.asientos_cuero=false;
        }
    }

    public String dime_asientos(){
        if(asientos_cuero==true){
            return "El coche tiene asientos de cuero";

        }
        else{
            return "El coche tiene asientos de serie";
        }
    }


    public void configura_climatizador(String climatizador){
        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }
        else{
            this.climatizador=false;
        }
    }

    public String dime_climatizador(){
        if(climatizador==true){
            return "El coche tiene climatizador";

        }
        else{
            return "El coche tiene aire acondicionado";
        }
    }

    public String dime_peso_coche(){
        int peso_carroceria=500;
        peso_total=peso_plataforma+peso_carroceria;

        if(asientos_cuero==true){
            peso_total=peso_total+50;

        }
        if(climatizador==true){
            peso_total=peso_total+20;
        }
    return "El peso del coche es " +peso_total;

}




}
