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
    private final String pathArxius ="src/arxius/";
    private final File arxiuUsuaris = new File(pathArxius+"usuaris.txt").getAbsoluteFile();
    private final int limitHashtagspesquera = 5;

    public static void main(String[] args) throws IOException {
        Pesca pesca = new Pesca();
        //pesca.comprovaUsuari("javi");
        pesca.altaUsuari();
        //pesca.demanarPesquera();
    }

    public Pesca(){
        this.arxiuUsuaris.getParentFile().mkdirs();
    }
    private String entraDades(String missatge){
        return JOptionPane.showInputDialog(missatge);
    }

    private void altaUsuari() throws IOException {
        String nom = entraDades("Nom");
        if (usuariExisteix(nom)){
           JOptionPane.showMessageDialog(null, new UserAlreadySignedUpException("Usuari ja donat d'alta").getMessage());
           return;
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

            if(lectura.equals(nom)) {
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


    private String llegirLinia(File arxiu, int limitHashtags, int cursorLinia, int contadorHashtags) throws IOException {
        InputStream inputStream = new FileInputStream(arxiu);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        int dades = inputStreamReader.read();
        String linia = "";

        while (dades != -1){

            char charLlegit = (char) dades;

            if (charLlegit == '#'){
                contadorHashtags++;
            }

                linia += charLlegit;
                dades = inputStreamReader.read();
            if(contadorHashtags==limitHashtags*(cursorLinia-1)){
                linia = "";
            }
                if(contadorHashtags==limitHashtags*cursorLinia){
                    inputStream.close();
                    return linia;
                }

            }
        inputStream.close();
        return null;
    }


    private String llegirSubLinia(String linia, int hashtagObjective) throws IOException {
     int contadorHashtags = 0;
     String subLinia = "";
        for (char caracter: linia.toCharArray()){
            if(caracter == '#'){
                contadorHashtags++;
                continue;
            }
            if(contadorHashtags == hashtagObjective){
                return subLinia;
            }
            subLinia += caracter;

        }

        return subLinia;
    }


    private Boolean usuariExisteix(String nomUsuari) throws IOException {
        boolean existeix = false;

        if (!this.arxiuUsuaris.exists()){
            return false;

        }
        String linia;
        int cursorLinia = 0;
        int contadorHashtags = 0;

      do {
          cursorLinia++;
          linia = llegirLinia(this.arxiuUsuaris, 3, cursorLinia, contadorHashtags);
          if(null == linia){
              return false;
          }
          String subLinia = llegirSubLinia(linia, 2);
          if (subLinia.equals(nomUsuari)){
              existeix = true;
          }

      } while (!existeix);

      return true;
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
