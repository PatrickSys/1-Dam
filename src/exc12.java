import java.util.Scanner;
public class exc12 {

    public static void main(String[] args) {
        System.out.println("Introdueix el nº de xifres que voleu conéixer");
        Scanner scanner=new Scanner(System.in);
        int vegades=scanner.nextInt();
        int x=0;
        int x1=1;
        System.out.println("introdueix el la quantitat de dígits que vols conéixer");
        for (int i = 2; i<vegades; i++){
            int x2=x+x1;
            x=x1;
            x1=x2;
            if (i==2) {
                System.out.println(0);
                System.out.println(x1);
                System.out.println(x2);
            }
            else System.out.println(x2);
        }

    }
}