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

        Parking_Joshua_Mas parking = new Parking_Joshua_Mas(7, 7);

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
        System.out.println(parking.getPlacesLliures(Parking_Joshua_Mas.TipusPlacesParking.Discapacitat) + " lliures discapacitats");
        System.out.println(parking.getPlacesOcupades(Parking_Joshua_Mas.TipusPlacesParking.Discapacitat) + " Ocupades discapacitats");
        System.out.println(parking.getPlacesLliures(Parking_Joshua_Mas.TipusPlacesParking.No_Discapacitat) + " lliures no Disc");
        System.out.println(parking.getPlacesOcupades(Parking_Joshua_Mas.TipusPlacesParking.No_Discapacitat) + " ocupades no Disc");

        System.out.println("matricules:");
        for (int i = 0; i < parking.getPlacesOcupades(Parking_Joshua_Mas.TipusPlacesParking.No_Discapacitat); i++) {


            System.out.println(parking.placesDisc[i] + " No Discapacitats");

        }
        for (int i = 0; i < parking.getPlacesOcupades(Parking_Joshua_Mas.TipusPlacesParking.Discapacitat); i++) {


            System.out.println(parking.placesDisc[i] + " Discapacitats");

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

