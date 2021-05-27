package Fishing;

import java.io.FileReader;

/************************************************************************
 Made by        PatrickSys
 Date           27/05/2021
 Package        Fishing
 Description:
 ************************************************************************/


public class prueba {

    public static void main(String[] args) throws Exception {
        prueba prueba = new prueba();

        System.out.println(prueba.leer(prueba.getClass().getClassLoader().getResource("users.txt").getFile(), 2, "mig"));
    }
    FileReader fr;

    public int leer(String path, int limite, String objetivo) throws Exception{
        fr = new FileReader(path);
        int contadorLinea = 0;
        int contadorHstg = 0;
        String str = "";
        boolean bucle = true;
        int c = fr.read();
        do{



            if (!str.startsWith("#")){
                str = "";
            }
            if (contadorHstg == limite) {
                contadorLinea++;
                contadorHstg = 0;
                if (str.equals('#' + objetivo + '#')) {
                    System.out.println("ey");
                    return contadorLinea;
                }
                str = "";
            }
            str += (char)c;
            if (c == '#') {
                contadorHstg++;
            }
            c = fr.read();
        }while(c != -1);

        fr.close();
        return -1;
    }

}
