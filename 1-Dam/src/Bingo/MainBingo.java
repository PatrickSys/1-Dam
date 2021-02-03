package Bingo;
//************************************************************************
//  Made by        PatrickSys
//  Date           03/02/2021
//  Package        Bingo
//
// Description 
//************************************************************************


public class MainBingo {


    public static void main(String[] args) {


        Cartolina cart= new Cartolina();

        cart.generarCartolines();
        System.out.println(cart.cartolina1.toString());
        System.out.println(cart.cartolina2.toString());
    }
}
