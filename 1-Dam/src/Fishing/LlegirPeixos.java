package Fishing;

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
        llegirPeixos.llegir(5);
    }

    private Peix llegir(int hashtags) throws IOException {


        int dades = inputStreamReader.read();
        int contadorHashtag = 0;
        int contadorPropietats = 0;
        String propietat = "";

        while(dades != -1){


            char charLlegit = (char) dades;

            if (charLlegit == '#'){
                contadorHashtag++;
                propietat += " ";
                dades = inputStreamReader.read();
                continue;
            }
            propietat += charLlegit;

            dades = inputStreamReader.read();

            if(contadorHashtag==hashtags){
                System.out.println(propietat);
                propietat="";
            }
        }
        inputStreamReader .close();

        return new Peix();
    }
}
