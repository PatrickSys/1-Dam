package Endevinaelnombre;

import java.util.Scanner;

public class GuessTheNumber {


    public  void Guess() {

        Scanner sc = new Scanner(System.in);
        boolean correct = false;  //boolean variable in case the number is guessed
        int tries = 1; //tries counter
        int number = (int) (Math.random() * 100);
        int[] numtried = new int[5]; //gives 5 tries
        int balance = 20;
        int i = 0;

        System.out.println("Let's guess a number between 0 and 99");

        do {


            int in = sc.nextInt();
            numtried[i] = in; //inserts tried number to the array
            i++;
            System.out.println(number+ " this");

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
            else if (tries >= 5) {  //if no tries left
                System.out.println("You exceeded permitted tries (" + tries + ")");
                System.out.println("You tried: ");
                for (int k : numtried) {
                    if (k != 0) {
                        System.out.println(k);
                    }

                }
                balance+=1;
                System.out.println("Machine's balance is " +balance + " €");

            }
            else { //while neither number is guessed nor tries left
                if (in < number) {
                    System.out.println("Try a higher number!!");

                    }

                }
                if (in > number) {
                    System.out.println("Try a lowe number!!");

                }
                System.out.println("Your try counter is " + tries + " tries");
                correct = false;





            tries++;
        } while (tries < 6 && !correct); //exits the loop when either exceeds number of tries or number is guessed

        System.out.println("Finished program");
        menu();

    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit=false;

        System.out.println("'Let's guess a number' Menu");
        System.out.println("1. Play the game");
        System.out.println("2. Exit the game");
        int choose = scanner.nextInt();

        while (!exit) {
            switch (choose) {

                case 1:
                    System.out.println("Good luck!!");

                    Guess();

                case 2:
                exit=true;

            }

        }

    }
}

