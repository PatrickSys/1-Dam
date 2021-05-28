package Fishing;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/************************************************************************
 Made by        PatrickSys
 Date           25/05/2021
 Package        Fishing
 Description:
 ************************************************************************/


public class LlegirPeixos {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        LlegirPeixos llegirPeixos = new LlegirPeixos();
        llegirPeixos.llegirPesquera();
    }


    private void llegirPesquera() throws IOException {

        String pesquera = entrarDades("A on vols pescar?");
        List<String> propietats = new LinkedList<>();
        propietats.add("nom");
        propietats.add("probabilitat");
        propietats.add("pes minim");
        propietats.add("pes maxim");
        int offset = propietats.indexOf(entrarDades("propietat a consultar"));
        llegirPropietat(pesquera, 5, offset);
    }

    private void llegirPropietat(String pesquera, int hashtags, int offset) throws IOException {

        InputStream is = getClass().getClassLoader().getResourceAsStream(pesquera + ".txt");
        InputStreamReader inputStreamReader = new InputStreamReader(is);
        int dades = inputStreamReader.read();
        int contadorHashtag = 0;
        int contadorPropietats = 0;
        String propietat = "";
        String objectiu = "";

        while(dades != -1){
            char charLlegit = (char) dades;

            if (charLlegit == '#'){
                contadorHashtag++;
                propietat = " ";
                dades = inputStreamReader.read();
                continue;
            }

            propietat += charLlegit;
            dades = inputStreamReader.read();

            if(contadorHashtag==hashtags){
                propietat="";
            }
            if(contadorHashtag==offset+1){
                System.out.println(propietat);
            }

        }
        inputStreamReader.close();
    }

    private String entrarDades(String missatge){
        System.out.println(missatge);
        return scanner.nextLine();
    }

    private int entrarSencer(String missatge){
        System.out.println(missatge);
        return scanner.nextInt();
    }
}
