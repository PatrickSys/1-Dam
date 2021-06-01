package Files;

import java.io.*;

public class TestFitxer {


    public static void main(String[] args) {


        try {
            File fitxer =new File("C:\\Users\\bitaz");
            FitxerDAM arxiu = new FitxerDAM();

            arxiu.escriure("Aixo es una provaa");
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

}
