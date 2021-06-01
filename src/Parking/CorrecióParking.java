package Parking;

import java.util.InputMismatchException;
import java.util.Scanner;

/************************************************************************
 Made by        PatrickSys
 Date           09/02/2021
 Package        PatrickSys
 Version        
 Description:
 ************************************************************************/

public class CorrecióParking {


    public static void main(String[] args) {

        Parkingv3_Patrick_Rossello parking = new Parkingv3_Patrick_Rossello(7, 7);

        try {




                parking.entraCotxe("1234ABV");
                parking.entraCotxe("3030ATY");
                parking.entraCotxeDiscapacitat("3333eee");
                parking.entraCotxeDiscapacitat("4444III");
                parking.surtCotxe("1234ABV");
                parking.surtCotxe("3030ATY");
                parking.surtCotxeDiscapacitats("3333eee");
                parking.surtCotxeDiscapacitats("4444III");




        } catch (Exception e) {
            e.printStackTrace();




        }
        System.out.println(parking.getPlacesLliures(Parkingv3_Patrick_Rossello.TipusPlacesParking.Discapacitat) + " lliures discapacitats");
        System.out.println(parking.getPlacesOcupades(Parkingv3_Patrick_Rossello.TipusPlacesParking.Discapacitat) + " Ocupades discapacitats");
        System.out.println(parking.getPlacesLliures(Parkingv3_Patrick_Rossello.TipusPlacesParking.No_Discapacitat) + " lliures no Disc");
        System.out.println(parking.getPlacesOcupades(Parkingv3_Patrick_Rossello.TipusPlacesParking.No_Discapacitat) + " ocupades no Disc");

        System.out.println("matricules:");
        for (int i = 0; i < parking.getPlacesOcupades(Parkingv3_Patrick_Rossello.TipusPlacesParking.No_Discapacitat); i++) {



        }
        for (int i = 0; i < parking.getPlacesOcupades(Parkingv3_Patrick_Rossello.TipusPlacesParking.Discapacitat); i++) {



        }


    }
    private static String generatePlate(){
        int plateNumber = (int)(Math.random() * 8888 + 1000);

        String plateLetter = "";
        String dictionary = "ABCDEFGHIJALMNOPQRSTUWXYZ";
        while(plateLetter.toCharArray().length <= 2){
            int x = (int)(Math.random() * dictionary.toCharArray().length);
            plateLetter += dictionary.toCharArray()[x];
        }
        String matricula = (plateNumber) + plateLetter;
        return matricula;
    }
}

