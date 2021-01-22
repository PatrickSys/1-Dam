package Files;
import java.io.*;

public class FitxerDAM {    //nom=path

   enum mode {lectura, escriptura} //modes

    private String nom;



    public FitxerDAM(){

    }

    public void fitxer(String path, mode mode) throws IOException {

        if (mode == mode.escriptura) {

        FileWriter fw= new FileWriter(path);

        }
        else if(mode==mode.lectura){
            FileReader fr=new FileReader(path);
        }
    }


    public boolean escriure(String text) throws IOException {
    boolean escrit=false;
    FitxerDAM arxiu= new FitxerDAM();
    arxiu.fitxer("\\home", mode.escriptura);

    if(text!=null){


    }


        return escrit;
    }


}
