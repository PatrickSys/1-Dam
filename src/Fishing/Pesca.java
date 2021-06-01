package Fishing;

import Exceptions.*;
import javax.swing.*;
import java.io.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.*;

/************************************************************************
 Made by        PatrickSys
 Date           25/05/2021
 Package        Fishing
 Description:
 ************************************************************************/


public class Pesca {
    private final String arxiusFolder = "arxius/";
    private final File arxiuUsuaris = new File(arxiusFolder, "usuaris.txt").getAbsoluteFile();
    private final File tempUsuaris = new File(arxiusFolder, "tempusuaris.txt").getAbsoluteFile();
    //private final String registres = new File(pathArxius + "registres.txt").getAbsoluteFile().toString();
    private final int hashtagspesquera = 5;
    private final int hashtagsUsuaris = 3;

    public static void main(String[] args) throws IOException, UserAlreadySignedUpException {
        Pesca pesca = new Pesca();
        pesca.menu();
    }

    public Pesca() throws IOException {
        this.arxiuUsuaris.createNewFile();
    }

    private void menu () {
        try {
            int option = entraSencer("Tria una opcio");
            switch (option) {
                case 1:
                    altaUsuari();
                    break;

                case 2:
                    baixaUsuari();
                    break;

               /* case 3:

                    break;*/

                default:
                    break;

            }
        }catch (Exception e){
            if (e.getMessage().equals("null")){
                menu();
            }
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        menu();
    }

    private String entraDades(String missatge){
        return JOptionPane.showInputDialog(missatge);
    }
    private int entraSencer(String missatge){
        return Integer.parseInt(JOptionPane.showInputDialog(missatge));
    }

    private void altaUsuari() throws IOException, UserAlreadySignedUpException {
        OutputStream outputStream;
        String nom = entraDades("Nom");
        if (usuariExisteix(nom)){
            throw new UserAlreadySignedUpException("L'usuari ja existeix");
        }
        JOptionPane.showMessageDialog(null, "Benvingut " + nom);
        String contrasenya = entraDades("contrasenya");


        String liniaAcomprovar = llegirLinia(this.arxiuUsuaris, 3, 1);
        outputStream = comprovaArxiuBuit(liniaAcomprovar, this.arxiuUsuaris);
        escriuHashtag(outputStream);
        escriuString(nom, outputStream);
        escriuHashtag(outputStream);
        escriuString(contrasenya, outputStream);
        escriuHashtag(outputStream);
        outputStream.close();
    }

    private OutputStream comprovaArxiuBuit(String linia, File arxiu) throws IOException {
        if (linia.isBlank()){
            return new FileOutputStream(arxiu, false);
        }
        else{
            OutputStream outputStream = new FileOutputStream(arxiu, true);
            afegeixSaltLinea(outputStream);
            return outputStream;

        }
    }

    private void baixaUsuari() throws IOException {
        this.tempUsuaris.createNewFile();
        String linia;
        String nom = entraDades("Nom");
        if (!usuariExisteix(nom)) {
            throw new UserNotFoundException("No té llicència");
        }
        int cursorLinia = 0;

        do {
            cursorLinia++;
            linia = llegirLinia(this.arxiuUsuaris, 3, cursorLinia);
            String nomLlegit = llegirSubLinia(linia, 2);
            if(!nomLlegit.equals(nom)) {
                reescriuLinia(linia, this.tempUsuaris);
            }


        }while(!linia.isBlank());

        this.arxiuUsuaris.delete();
        System.gc();
        Files.move(Paths.get(this.tempUsuaris.toString()), Paths.get(this.arxiuUsuaris.toString()));

    }

    private void reescriuLinia (String linia, File arxiu) throws IOException {
        String primeraLinia = llegirLinia(arxiu, 3, 1);
        OutputStream outputStream = comprovaArxiuBuit(primeraLinia, arxiu);
        if (linia.isBlank()){
            outputStream.close();
            return;
        }
        escriuString(linia, outputStream);
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

    private String llegirLinia(File arxiu, int limitHashtags, int cursorLinia) throws IOException {
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
        return subLinia.trim();
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
              return true;
          }

      } while (!linia.isBlank());

      return existeix;
    }


    private void pescar() throws IOException {
        //String pesquera = this.pathArxius + entraFitxer("On vols pescar?");
        int offset = getPosicioPropietat("nom");
        //llegirArxiu(pesquera, 5, offset);

    }

    private int getPosicioPropietat(String propietatAConsultar){

          switch (propietatAConsultar.toLowerCase()) {
              case "nom":
                  return 1;
              case "probabilitat de pesca":
              case "contrasenya":
                  return 2;
              case "pes minim":
                  return 3;
              case "pes maxim":
                  return 4;
              default:
                  return  0;
        }
    }



    private String entraFitxer(String missatge){
        return entraDades(missatge) + ".txt";
    }

}
