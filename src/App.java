import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<String> alumnes= new ArrayList<String>();


        alumnes.add("Gonzalo");
        alumnes.add("Rodrigo");
        alumnes.add("Patrick");

        Collections.sort(alumnes);
        System.out.println(alumnes);

    }

}




