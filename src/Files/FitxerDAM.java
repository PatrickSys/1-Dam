package Files;
import java.io.*;

public class FitxerDAM {    //nom=path

   public enum mode {lectura, escriptura} //modes

    private String nom;
   // Segona possibilitat
    File accesFitxer;
    FileWriter fw;
    FileReader fr;

    public FitxerDAM(){

    }

    public void fitxer(String path/*, mode mode*/) throws IOException {
/*
        mode=mode;
        if (mode == mode.escriptura) {

        this.fw= new FileWriter(path);
        this.accesFitxer=new File(path);

        }
        else if(mode==mode.lectura){
            this.fr=new FileReader(path);}*/
            this.accesFitxer=new File(path);

    }


    public boolean escriure(String text) throws IOException {
    boolean escrit=false;


        BufferedWriter bw=new BufferedWriter(fw); //nova instancia BW que reb com a parametre fw
        bw.write(text); //bw escriu el text rebut com a parametre

    if(text!=null) {

        escrit = true;

    }

        return escrit;
    }

    public String llegir(int numlinies){


        String llegit= " ";
        return "El text escrit és:" +llegit;
    }

}
