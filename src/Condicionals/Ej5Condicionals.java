package Condicionals;

public class Ej5Condicionals {
    public static double  equacio(double a, double b) {
        double x=((-b)/a);
        return x;

    }

    public static void main(String[] args) {
        double valor1=4;
        double valor2=3;
        System.out.println("la ecuación es " + valor1 + "x + " + valor2 + " =0" );



        double valor = equacio(valor1, valor2);

        System.out.println( "El valor de X es: " + valor);


    }
}
