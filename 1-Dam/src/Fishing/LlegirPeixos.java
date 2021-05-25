package Fishing;

import CompSim.Software;
import POO.Parking;

import java.io.*;

/************************************************************************
 Made by        PatrickSys
 Date           25/05/2021
 Package        Fishing
 Description:
 ************************************************************************/


public class LlegirPeixos {

    public static void main(String[] args) throws IOException {
        LlegirPeixos llegirPeixos = new LlegirPeixos();
        llegirPeixos.llegirPeixos();
    }

    private Peix llegirPeixos() throws IOException {

        InputStream is = getClass().getClassLoader().getResourceAsStream("mediterrania.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(is);
        int dades = inputStreamReader.read();
        int contadorHashtag = 0;
        int contadorPropietats = 0;
        String propietat = "";

        while(dades != -1){

            char charLlegit = (char) dades;
            if (charLlegit == '#');{
                contadorPropietats++;
            }
            propietat += charLlegit;



            dades = inputStreamReader.read();
            System.out.println(charLlegit + "  és el");
        }
        inputStreamReader .close();

        return new Peix();
    }
}
