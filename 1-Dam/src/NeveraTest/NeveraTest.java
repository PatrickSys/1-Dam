package NeveraTest;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

/************************************************************************
 Made by        PatrickSys
 Date           19/02/2021
 Package        PatrickSys
 Version        
 Description:
 ************************************************************************/

class NeveraTest {



    @Test
    public void testNevera() throws NoSuchItemException{

        Nevera n = new Nevera();
        String[] food = new String[]{
                "queso",
                "yogur",
                "pera",
                "piña"
        };


        for(int i = 0; i<food.length; i++){

            n.put(food[i]);
            assertTrue(n.contains(food[i]));
            assertTrue(n.take(food[i]));


        }


    }

}