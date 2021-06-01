package NeveraTest;

/************************************************************************
 Made by        PatrickSys
 Date           18/02/2021
 Package        PatrickSys
 Version        
 Description:
 ************************************************************************/

import java.util.Collection;
import java.util.HashSet;

public class Nevera{



    private Collection<String> comida = new HashSet<String>();

    public boolean put(String item){
        return comida.add(item);
    }

    public boolean contains(String item){
        return comida.contains(item);
    }

    public boolean take (String item) throws NoSuchItemException {
        boolean resultado = comida.remove(item);
        if (!resultado){
            throw new NoSuchItemException(item + "no encontrado en la nevera");
        }
        return resultado;
    }

}