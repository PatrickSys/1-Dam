package Cinema;

import java.util.ArrayList;

public class MainCinema {

    public static void main(String[] args) {

        //Get the current system time to later calculate run time
        long startTime = System.currentTimeMillis();


        //Create instances
        Movie Frankstein = new Movie("Frankstein", 189, 12, "Jéremy Lacroix");
        Cinema cine1= new Cinema(8.5);

        //ArrayList of spectators
        ArrayList <Integer> cine1Seats= new ArrayList<>();

        //Set Cinema Capacity to the desired size
        cine1.setCinemaCapacity(15,15,cine1Seats);

        //Set Cinema Movie
        cine1.setCurrentMovie(Frankstein);

        //Get Info we want to know
        //System.out.println(cine1.getCinemaInfo());
        //System.out.println(Frankstein.getMovieInfo());

        //fill the cinema
        cine1.fillCinema(cine1, Frankstein, cine1Seats);

        System.out.println("\n" +cine1.getEarnedMoney()+ " € recaudats");

        //Calculate run time
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;


        System.out.println("El programa ha tardat " + totalTime + " milisegons en resoldre el problema");
    }
}
