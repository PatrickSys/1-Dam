package Bingo;
//************************************************************************
//  Made by        PatrickSys
//  Date           01/02/2021
//  Package        Bingo
//
// Description 
//************************************************************************


public class MainBingo {


    //cream instancies i jugam al bingo
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Machine Bingo = new Machine();
        Player player1= new Player("Juan");
        Player player2 = new Player("Pedro");
        Bingo.playBingo(player1, player2);

        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println("Temps en resoldre el bingo: " + totalTime + "ms ");


    }


}
