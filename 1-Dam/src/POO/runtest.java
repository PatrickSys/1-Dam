package POO;
import java.util.Scanner;

public class runtest {
   public static void main(String[] args) {

      int[] numbers=new int[100];

      int sum=0;
      double mean;

      for (int i=0; i<numbers.length; i++){

         numbers[i]=i+1;
         sum+=numbers[i];
      }

      System.out.println(" The sum is " +sum);

      mean=(double)sum/numbers.length;

      System.out.println("La mean is " +mean);
   }
}
