package Bingo;
//************************************************************************
//  Made by        PatrickSys
//  Date           03/02/2021
//  Package        Bingo
//
// Description 
//************************************************************************


import java.util.ArrayList;
import java.util.Random;

public class Player {



    //Instanciam una cartolina per a cada jugador
    Cartolina playerCartolina= new Cartolina();
    ArrayList<Integer> numbersGenerated = new ArrayList<>();
    //Creates new random between 1 and 99
    Random rand = new Random();
    int max=100;
    int min=1;
    int number = rand.nextInt((max - min) + 1) + min;
    String name;




    //Assignam a cada jugador un objecte cartolina amb dues cartolines amb els nombres aleatoris
    public Player(String name){

        this.playerCartolina.generarCartolines();
        this.name=name;

    }



    public void checkNumber(){

        if (playerCartolina.cartolina1.isEmpty()&playerCartolina.cartolina2.isEmpty()){

            System.out.println("El jugador " +name + " canta Bingo!");
        }

        if(!numbersGenerated.contains(number)) {
            if (playerCartolina.cartolina1.contains(number)) {
                playerCartolina.cartolina1.remove(number);

            }
            if (playerCartolina.cartolina2.contains(number)) {
                playerCartolina.cartolina2.remove(number);
            }
            numbersGenerated.add(number);

        }

    }


}
