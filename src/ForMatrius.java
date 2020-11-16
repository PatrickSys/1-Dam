import java.util.Scanner;
public class ForMatrius {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix la longitud");
        int longitud = scanner.nextInt();
        int[] exemple = new int[longitud];
        System.out.println("introudeix els valors");
        for (int i=0; i<exemple.length; i++)
            exemple[i] = scanner.nextInt();


    }
}
