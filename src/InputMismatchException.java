import java.util.Scanner;
public class InputMismatchException {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        do try {

            System.out.print("Introduzca un número de 0 a 9: ");
            int number = scanner.nextInt();
            correct = number <= 9 && number >= 0;
            if (correct) { //if que executarà el bucle si el nombre esta entre 0 i 9
                for (int counter = 0; counter < 10; counter++) {
                    System.out.println(number + " * " + counter + " = " + number * counter); //bucle for per fer la taula


                }
            } else {
                System.out.println("Número incorrecto, introduzca un número de 0 a 9");

            }

        } catch (java.lang.Throwable e) {
            //Display Error message
            System.out.println("Carácter inválido, por favor, introduzca un número");
            scanner.nextLine();
        } while (!correct);

    }
}