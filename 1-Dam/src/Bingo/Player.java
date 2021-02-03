package Bingo;
//************************************************************************
//  Made by        PatrickSys
//  Date           01/02/2021
//  Package        Bingo
//
// Description 
//************************************************************************


import java.util.ArrayList;
import java.util.Random;


public class Player {



    //Instanciam una cartolina per a cada jugador
    ArrayList <Integer> cartolina= new ArrayList<>();

    //Creates new random between 1 and 99
    Random rand = new Random();
    int max=100;
    int min=1;
    String name;
    int cartolinaSize=10;



    boolean playerWon=false;




    //Assignam a cada jugador un objecte cartolina amb dues cartolines amb els nombres aleatoris
    public Player(String name){

        generateCartolina();
        this.name=name;
    }




    private void generateCartolina() {


        setCartolina();
        int number;
        Random rand = new Random();




        //mentres la cartolina tengui alguna posició nula assignarà
        while(cartolina.contains(null)) {
            for (int i = 0; i < cartolinaSize; i++) {

                number = rand.nextInt((max - min) + min) + 1;
                if (!cartolina.contains(number)) {
                    cartolina.set(i, number);

                }
            }
        }
    }


    //assigna els numeros de la cartolina a valor null
    private void setCartolina(){

        for (int i=0; i<cartolinaSize; i++){

            cartolina.add(null);
        }
    }






}
