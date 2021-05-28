package Fishing;

import Exceptions.*;
import javax.swing.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.ServerError;

/************************************************************************
 Made by        PatrickSys
 Date           25/05/2021
 Package        Fishing
 Description:
 ************************************************************************/


public class Pesca {
    private final String pathArxius ="1-Dam/arxius/";
    private final String arxiuUsuaris = new File(pathArxius+"usuaris.txt").getAbsoluteFile().toString();
    private final int limitHashtagspesquera = 5;

    public static void main(String[] args) throws IOException {
        Pesca pesca = new Pesca();
        //pesca.comprovaUsuari("javi");
        pesca.altaUsuari();
        //pesca.demanarPesquera();
    }

    private String entraDades(String missatge){
        return JOptionPane.showInputDialog(missatge);
    }

    private void altaUsuari() throws IOException {
        String nom = entraDades("Nom");
        if (usuariExisteix(nom)){
            throw new UserNotFoundException(" L'usuari ja existeix");
        }
        JOptionPane.showMessageDialog(null, "Benvingut " + nom);
        String contrasenya = entraDades("contrasenya");


        OutputStream outputStream = new FileOutputStream(this.arxiuUsuaris, true);
        afegeixSaltLinea(outputStream);
        escriuHashtag(outputStream);
        escriuString(nom, outputStream);
        escriuHashtag(outputStream);
        escriuString(contrasenya, outputStream);
        escriuHashtag(outputStream);
        outputStream.close();
    }

    private void afegeixSaltLinea(OutputStream outputStream) throws  IOException{
        outputStream.write(10);
    }

    private void escriuHashtag(OutputStream outputStream) throws IOException {
        outputStream.write('#');
    }
    private void escriuString(String string, OutputStream outputStream) throws IOException {
        for (char lletra: string.toCharArray()){
            outputStream.write(lletra);
        }
    }

    private Boolean comprovaUsuari(String nom) throws IOException {
        int limitHashtags = 3;
        int contadorHashtags = 0;
        InputStream inputStream = new FileInputStream("usuaris.txt");
        int cursor =  inputStream.read();
        String lectura ="";
        while (cursor != -1){

            if(lectura.equalsIgnoreCase(nom)) {
                return true;
            }
            char lletra = (char) cursor;

            if(contadorHashtags==limitHashtags){
                lectura = "";
                contadorHashtags = 0;
                continue;
            }
            lectura += lletra;
            cursor = inputStream.read();

            if(lletra == '#'){
                contadorHashtags++;
            }
        }


    return false;
    }


    private String llegirLinia(String arxiu, int limitHashtags) throws IOException {
        InputStream inputStream = new FileInputStream(arxiu);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int dades = inputStreamReader.read();
        int contadorHashtags = 0;
        String linia = "";

        while (dades != -1){

            char charLlegit = (char) dades;

            if (charLlegit == '#'){
                contadorHashtags++;
            }

                linia += charLlegit;
                dades = inputStreamReader.read();

                if(contadorHashtags==limitHashtags){
                    inputStream.close();
                    return linia;
                }

            }
        inputStream.close();
        return linia;
    }


    private String llegirSubLinia(String linia, int hashtagObjective, int cursorLinia) throws IOException {
     int contadorHashtags = 0;
     String subLinia = "";
        for (char caracter: linia.toCharArray()){
            if(caracter == '#'){
                caracter = ' ';
                contadorHashtags++;
            }
            subLinia += caracter;

            if(contadorHashtags == hashtagObjective*cursorLinia){
                return subLinia;
            }
        }

        return subLinia;
    }


    private Boolean usuariExisteix(String nomUsuari) throws IOException {
        String linia;
        int cursorLinia = 0;
      do{
          cursorLinia++;
          linia = llegirLinia(this.arxiuUsuaris, 2);
          String subLinia = llegirSubLinia(linia, 2, cursorLinia);
          if (subLinia.equalsIgnoreCase(nomUsuari)){
              return true;
          }

      } while (null != linia);

      return false;
    }


    private void demanarPesquera() throws IOException {
        String pesquera = this.pathArxius + entraFitxer("On vols pescar?");
        int offset = getPosicioPropietat("nom");
        //llegirArxiu(pesquera, 5, offset);

    }

    private int getPosicioPropietat(String propietatAConsultar){

        return switch (propietatAConsultar.toLowerCase()) {
            case "nom" -> 1;
            case "probabilitat de pesca", "contrasenya" -> 2;
            case "pes minim" -> 3;
            case "pes maxim" -> 4;
            default -> 0;
        };
    }




    private String entraFitxer(String missatge){
        return entraDades(missatge) + ".txt";
    }

}
