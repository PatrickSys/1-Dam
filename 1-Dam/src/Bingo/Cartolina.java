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

public class Cartolina {


    //Cream les cartolines que tendran els nombres, limits de max i minim
    ArrayList <Integer> cartolina1= new ArrayList<>();
    ArrayList <Integer> cartolina2= new ArrayList<>();
    int max=100;
    int min=1;



    public void generarCartolines(){

        Random rand = new Random();

        for(int i =0; i<20; i++){


            this.cartolina1.add(rand.nextInt((max - min) + 1) + min);
            this.cartolina2.add(rand.nextInt((max - min) + 1) + min);
        }



    }
}
