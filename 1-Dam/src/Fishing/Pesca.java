package Fishing;

import Exceptions.*;
import javax.swing.*;
import java.io.*;

/************************************************************************
 Made by        PatrickSys
 Date           25/05/2021
 Package        Fishing
 Description:
 ************************************************************************/


public class Pesca {
    private final String pathArxius ="1-Dam/arxius/";
    private final String arxiuUsuaris = new File(pathArxius + "usuaris.txt").getAbsoluteFile().toString();
    private final String registres = new File(pathArxius + "registres.txt").getAbsoluteFile().toString();
    private final int hashtagspesquera = 5;
    private final int hashtagsUsuaris = 3;

    public static void main(String[] args) throws IOException, UserAlreadySignedUpException {
        Pesca pesca = new Pesca();
        pesca.menu();
    }

    private void menu () throws IOException, UserAlreadySignedUpException {
        int option = entraSencer("Tria una opcio");
        switch (option){
            case 1:
                altaUsuari();
                break;

            case 2:
                baixaUsuari();
                break;

            case 3:

        }
    }

    private String entraDades(String missatge){
        return JOptionPane.showInputDialog(missatge);
    }
    private int entraSencer(String missatge){
        return Integer.parseInt(JOptionPane.showInputDialog(missatge));
    }

    private void altaUsuari() throws IOException, UserAlreadySignedUpException {
        String nom = entraDades("Nom");
        if (usuariExisteix(nom)){
            throw new UserAlreadySignedUpException("L'usuari ja existeix");
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

    private void baixaUsuari() throws IOException {
        String linia;
        String nom = entraDades("Nom");
        if (!usuariExisteix(nom)) {
            throw new UserNotFoundException("No té llicència");
        }
        int cursorLinia = 0;

        do {
            cursorLinia++;
            linia = llegirLinia(arxiuUsuaris, 3, cursorLinia);
            if (linia.equals(nom)){
                cursorLinia++;
                linia = llegirLinia(arxiuUsuaris, 3, cursorLinia);


            }




        }while(!linia.isBlank());



    }

    private void reescriuLinia (String linia) throws IOException {
        OutputStream outputStream = new FileOutputStream(this.arxiuUsuaris);


        for (char caracter: linia.toCharArray()){
            outputStream.write(caracter);
        }
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


    private String llegirLinia(String arxiu, int limitHashtags, int cursorLinia) throws IOException {
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

            if(contadorHashtags==(limitHashtags * cursorLinia) - limitHashtags){
                linia = "";
                continue;
            }

                if(contadorHashtags==limitHashtags * cursorLinia){
                    inputStream.close();
                    return linia;
                }

                if (contadorHashtags % limitHashtags == 0){
                    linia = "";
                }
            }
        inputStream.close();
        return linia;
    }


    private String llegirSubLinia(String linia, int objectiuHashtags) throws IOException {
        int contadorHashtags = 0;
        String subLinia = "";

        for (char caracter: linia.toCharArray()){
            if(caracter == '#'){
                caracter = ' ';
                contadorHashtags++;
            }
            subLinia += caracter;

            if(contadorHashtags == objectiuHashtags ){
                return subLinia.trim();

            }
        }
        return subLinia;
    }


    private Boolean usuariExisteix(String nomUsuari) throws IOException {
        boolean existeix = false;
        String linia;
        int cursorLinia = 0;
      do{
          cursorLinia++;
          linia = llegirLinia(this.arxiuUsuaris, 3, cursorLinia);
          String subLinia = llegirSubLinia(linia, 2);
          if (subLinia.equalsIgnoreCase(nomUsuari)){
              existeix = true;
          }

      } while (!existeix);

      return existeix;
    }


    private void pescar() throws IOException {
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
