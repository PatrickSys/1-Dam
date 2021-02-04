//************************************************************************
//  Made by        PatrickSys
//  Date           29/01/2021
//  Package        PACKAGE_NAME
//
// Description 
//************************************************************************


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class proves {



    public static void main(String[] args)
    {


        ArrayList<Integer> prova = new ArrayList<>();
        for (int i=0; i<20; i++){

            prova.add(null);
        }


        //prova.removeAll(Collections.singleton(null));
        System.out.println(prova.stream().toString());
        System.out.println(prova.toString());
        System.out.println(prova.isEmpty());



    }




}
