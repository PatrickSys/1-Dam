package Bucles;
//************************************************************************
//  Made by        PatrickSys
//  Date           04/02/2021
//  Package        Bucles
//
// Description 
//************************************************************************


import java.util.ArrayList;

public class ArrayListSort {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(8);
        numbers.add(6);
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);


        for (int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        for(int i=0; i<numbers.size()-1; i++){

            for(int j =0; j<numbers.size()-i-1; j++){

                if(numbers.get(j)>numbers.get(j+1)){

                    int temp= numbers.get(j);
                    numbers.set(j,numbers.get(j+1));
                    numbers.set(j+1, temp);

                }
            }

        }


    }
}
