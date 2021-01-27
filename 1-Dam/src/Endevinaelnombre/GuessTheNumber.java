package Endevinaelnombre;




import java.util.Scanner;



public class GuessTheNumber {
    int balance = 20;

    public void Guess() {
        Scanner sc = new Scanner(System.in);
        boolean correct = false;  //boolean variable in case the number is guessed
        int tries = 1; //tries counter
        int number = (int) (Math.random() * 100);
        int[] numtried = new int[100]; //gives 5 tries
        int i = 0;
        balance++;
        System.out.println("Let's guess a number between 0 and 99");
        do {
            int in = sc.nextInt();
            numtried[i] = in; //inserts tried number to the array
            i++;

            if (in == number) { //if number is guessed, also gives 5e of prize
                System.out.println("You guessed the number in " + (tries) + " tries!!");
                System.out.println("You tried: ");
                for (int k : numtried) {
                    if (k != 0) {
                        System.out.println(k);
                    }
                }
                balance -= 5;
                System.out.println("You win 5€!");
                System.out.println("Machine's balance is: " + balance + " €");
                correct = true;

            }
            else if (tries>= 5) {//if no tries left

                if(tries==5) {
                    System.out.println("You exceeded permitted tries (" + tries + ")");
                    System.out.println("You tried: ");
                    for (int k : numtried) {
                        if (k != 0) {
                            System.out.println(k);
                        }
                    }
                }

                System.out.println("Machine's balance is " + balance + " €");
                System.out.println("You can have one more try!");
                System.out.println("1.Pay 1€ for one more try");
                System.out.println("2.Loose your opportunity to be a winner");
                int choose=sc.nextInt();

                switch(choose){
                    case 1:
                        System.out.println("Try again!!");
                        balance+=1;
                        break;

                    case 2:
                        System.out.println("Looser!");
                        System.out.println(balance);
                        correct=true;
                }
            }
            else { //while neither number is guessed nor tries left
                System.out.println("Your try counter is " + tries + " tries");
                if (in < number) {
                    System.out.println("Try a higher number!!");
                }
                if (in > number) {
                    System.out.println("Try a lower number!!");
                }
                System.out.println(number + " this");
            }

            tries++;
        } while (!correct); //exits the loop when either exceeds number of tries or number is guessed
    }
}
