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

    int max=100;
    int min=1;

    //Cream les cartolines que tendran els nombres, limits de max i minim
    ArrayList <Integer> cartolina1= new ArrayList<>();
    ArrayList <Integer> cartolina2= new ArrayList<>();

    //mètode que genera dues cartolines amb els numeros aleatoris entre 1 i 99
    public void generarCartolines(){


        Random rand = new Random();

        //genera dues cartolines amb nombres aleatoris entre 1 i 99
        for(int i =0; i<20; i++){

            cartolina1.add(rand.nextInt((max - min) + 1) + min);
            cartolina2.add(rand.nextInt((max - min) + 1) + min);
        }



    }



}
